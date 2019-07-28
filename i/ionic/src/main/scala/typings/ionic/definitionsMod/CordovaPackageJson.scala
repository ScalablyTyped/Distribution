package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCliDashFramework.definitionsMod.PackageJson
import typings.ionic.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPackageJson extends PackageJson {
  var cordova: Anon_Key
}

object CordovaPackageJson {
  @scala.inline
  def apply(
    cordova: Anon_Key,
    name: String,
    version: String,
    bin: StringDictionary[js.UndefOr[String]] = null,
    dependencies: StringDictionary[js.UndefOr[String]] = null,
    description: String = null,
    devDependencies: StringDictionary[js.UndefOr[String]] = null,
    main: String = null,
    scripts: StringDictionary[js.UndefOr[String]] = null
  ): CordovaPackageJson = {
    val __obj = js.Dynamic.literal(cordova = cordova, name = name, version = version)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (main != null) __obj.updateDynamic("main")(main)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[CordovaPackageJson]
  }
}

