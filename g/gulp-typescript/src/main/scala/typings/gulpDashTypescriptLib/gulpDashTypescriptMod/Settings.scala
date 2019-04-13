package typings
package gulpDashTypescriptLib.gulpDashTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var allowNonTsExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var codepage: js.UndefOr[scala.Double] = js.undefined
  var declaration: js.UndefOr[scala.Boolean] = js.undefined
  var declarationFiles: js.UndefOr[scala.Boolean] = js.undefined
  var experimentalDecorators: js.UndefOr[scala.Boolean] = js.undefined
  var getCustomTransformers: js.UndefOr[gulpDashTypescriptLib.releaseTypesMod.GetCustomTransformers] = js.undefined
  var isolatedModules: js.UndefOr[scala.Boolean] = js.undefined
  var jsx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var lib: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var mapRoot: js.UndefOr[java.lang.String] = js.undefined
  var module: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.ModuleKind] = js.undefined
  var moduleResolution: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var noEmitOnError: js.UndefOr[scala.Boolean] = js.undefined
  var noExternalResolve: js.UndefOr[scala.Boolean] = js.undefined
  var noImplicitAny: js.UndefOr[scala.Boolean] = js.undefined
  var noLib: js.UndefOr[scala.Boolean] = js.undefined
  var noLibCheck: js.UndefOr[scala.Boolean] = js.undefined
  var noResolve: js.UndefOr[scala.Boolean] = js.undefined
  var out: js.UndefOr[java.lang.String] = js.undefined
  var outDir: js.UndefOr[java.lang.String] = js.undefined
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  var preserveConstEnums: js.UndefOr[scala.Boolean] = js.undefined
  var removeComments: js.UndefOr[scala.Boolean] = js.undefined
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  var rootDirs: js.UndefOr[js.Any] = js.undefined
  var sortOutput: js.UndefOr[scala.Boolean] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  var suppressImplicitAnyIndexErrors: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.ScriptTarget] = js.undefined
  var typescript: js.UndefOr[gulpDashTypescriptLib.Anon_08] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowNonTsExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    charset: java.lang.String = null,
    codepage: scala.Int | scala.Double = null,
    declaration: js.UndefOr[scala.Boolean] = js.undefined,
    declarationFiles: js.UndefOr[scala.Boolean] = js.undefined,
    experimentalDecorators: js.UndefOr[scala.Boolean] = js.undefined,
    getCustomTransformers: gulpDashTypescriptLib.releaseTypesMod.GetCustomTransformers = null,
    isolatedModules: js.UndefOr[scala.Boolean] = js.undefined,
    jsx: java.lang.String | scala.Double = null,
    lib: js.Array[java.lang.String] = null,
    locale: java.lang.String = null,
    mapRoot: java.lang.String = null,
    module: java.lang.String | typescriptLib.typescriptMod.ModuleKind = null,
    moduleResolution: java.lang.String | scala.Double = null,
    noEmitOnError: js.UndefOr[scala.Boolean] = js.undefined,
    noExternalResolve: js.UndefOr[scala.Boolean] = js.undefined,
    noImplicitAny: js.UndefOr[scala.Boolean] = js.undefined,
    noLib: js.UndefOr[scala.Boolean] = js.undefined,
    noLibCheck: js.UndefOr[scala.Boolean] = js.undefined,
    noResolve: js.UndefOr[scala.Boolean] = js.undefined,
    out: java.lang.String = null,
    outDir: java.lang.String = null,
    outFile: java.lang.String = null,
    preserveConstEnums: js.UndefOr[scala.Boolean] = js.undefined,
    removeComments: js.UndefOr[scala.Boolean] = js.undefined,
    rootDir: java.lang.String = null,
    rootDirs: js.Any = null,
    sortOutput: js.UndefOr[scala.Boolean] = js.undefined,
    sourceRoot: java.lang.String = null,
    suppressImplicitAnyIndexErrors: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String | typescriptLib.typescriptMod.ScriptTarget = null,
    typescript: gulpDashTypescriptLib.Anon_08 = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNonTsExtensions)) __obj.updateDynamic("allowNonTsExtensions")(allowNonTsExtensions)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (codepage != null) __obj.updateDynamic("codepage")(codepage.asInstanceOf[js.Any])
    if (!js.isUndefined(declaration)) __obj.updateDynamic("declaration")(declaration)
    if (!js.isUndefined(declarationFiles)) __obj.updateDynamic("declarationFiles")(declarationFiles)
    if (!js.isUndefined(experimentalDecorators)) __obj.updateDynamic("experimentalDecorators")(experimentalDecorators)
    if (getCustomTransformers != null) __obj.updateDynamic("getCustomTransformers")(getCustomTransformers.asInstanceOf[js.Any])
    if (!js.isUndefined(isolatedModules)) __obj.updateDynamic("isolatedModules")(isolatedModules)
    if (jsx != null) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mapRoot != null) __obj.updateDynamic("mapRoot")(mapRoot)
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (moduleResolution != null) __obj.updateDynamic("moduleResolution")(moduleResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(noEmitOnError)) __obj.updateDynamic("noEmitOnError")(noEmitOnError)
    if (!js.isUndefined(noExternalResolve)) __obj.updateDynamic("noExternalResolve")(noExternalResolve)
    if (!js.isUndefined(noImplicitAny)) __obj.updateDynamic("noImplicitAny")(noImplicitAny)
    if (!js.isUndefined(noLib)) __obj.updateDynamic("noLib")(noLib)
    if (!js.isUndefined(noLibCheck)) __obj.updateDynamic("noLibCheck")(noLibCheck)
    if (!js.isUndefined(noResolve)) __obj.updateDynamic("noResolve")(noResolve)
    if (out != null) __obj.updateDynamic("out")(out)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (!js.isUndefined(preserveConstEnums)) __obj.updateDynamic("preserveConstEnums")(preserveConstEnums)
    if (!js.isUndefined(removeComments)) __obj.updateDynamic("removeComments")(removeComments)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (rootDirs != null) __obj.updateDynamic("rootDirs")(rootDirs)
    if (!js.isUndefined(sortOutput)) __obj.updateDynamic("sortOutput")(sortOutput)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (!js.isUndefined(suppressImplicitAnyIndexErrors)) __obj.updateDynamic("suppressImplicitAnyIndexErrors")(suppressImplicitAnyIndexErrors)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (typescript != null) __obj.updateDynamic("typescript")(typescript)
    __obj.asInstanceOf[Settings]
  }
}

