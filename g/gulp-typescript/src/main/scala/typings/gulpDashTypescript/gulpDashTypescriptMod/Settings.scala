package typings.gulpDashTypescript.gulpDashTypescriptMod

import org.scalablytyped.runtime.StringDictionary
import typings.gulpDashTypescript.Typeofts
import typings.gulpDashTypescript.releaseTypesMod.GetCustomTransformers
import typings.typescript.typescriptMod.ModuleKind
import typings.typescript.typescriptMod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings
  extends /* name */ StringDictionary[js.Any] {
  var allowNonTsExtensions: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var codepage: js.UndefOr[Double] = js.undefined
  var declaration: js.UndefOr[Boolean] = js.undefined
  var declarationFiles: js.UndefOr[Boolean] = js.undefined
  var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
  var getCustomTransformers: js.UndefOr[GetCustomTransformers] = js.undefined
  var isolatedModules: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[String | Double] = js.undefined
  var lib: js.UndefOr[js.Array[String]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var mapRoot: js.UndefOr[String] = js.undefined
  var module: js.UndefOr[String | ModuleKind] = js.undefined
  var moduleResolution: js.UndefOr[String | Double] = js.undefined
  var noEmitOnError: js.UndefOr[Boolean] = js.undefined
  var noExternalResolve: js.UndefOr[Boolean] = js.undefined
  var noImplicitAny: js.UndefOr[Boolean] = js.undefined
  var noLib: js.UndefOr[Boolean] = js.undefined
  var noLibCheck: js.UndefOr[Boolean] = js.undefined
  var noResolve: js.UndefOr[Boolean] = js.undefined
  var out: js.UndefOr[String] = js.undefined
  var outDir: js.UndefOr[String] = js.undefined
  var outFile: js.UndefOr[String] = js.undefined
  var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
  var removeComments: js.UndefOr[Boolean] = js.undefined
  var rootDir: js.UndefOr[String] = js.undefined
  var rootDirs: js.UndefOr[js.Any] = js.undefined
  var sortOutput: js.UndefOr[Boolean] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
  var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String | ScriptTarget] = js.undefined
  var typescript: js.UndefOr[Typeofts] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowNonTsExtensions: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    codepage: Int | Double = null,
    declaration: js.UndefOr[Boolean] = js.undefined,
    declarationFiles: js.UndefOr[Boolean] = js.undefined,
    experimentalDecorators: js.UndefOr[Boolean] = js.undefined,
    getCustomTransformers: GetCustomTransformers = null,
    isolatedModules: js.UndefOr[Boolean] = js.undefined,
    jsx: String | Double = null,
    lib: js.Array[String] = null,
    locale: String = null,
    mapRoot: String = null,
    module: String | ModuleKind = null,
    moduleResolution: String | Double = null,
    noEmitOnError: js.UndefOr[Boolean] = js.undefined,
    noExternalResolve: js.UndefOr[Boolean] = js.undefined,
    noImplicitAny: js.UndefOr[Boolean] = js.undefined,
    noLib: js.UndefOr[Boolean] = js.undefined,
    noLibCheck: js.UndefOr[Boolean] = js.undefined,
    noResolve: js.UndefOr[Boolean] = js.undefined,
    out: String = null,
    outDir: String = null,
    outFile: String = null,
    preserveConstEnums: js.UndefOr[Boolean] = js.undefined,
    removeComments: js.UndefOr[Boolean] = js.undefined,
    rootDir: String = null,
    rootDirs: js.Any = null,
    sortOutput: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null,
    suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined,
    target: String | ScriptTarget = null,
    typescript: Typeofts = null
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

