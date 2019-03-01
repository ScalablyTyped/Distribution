package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPackageJson
  extends atIonicCliDashFrameworkLib.definitionsMod.PackageJson {
  var cordova: ionicLib.Anon_Key
}

object CordovaPackageJson {
  @scala.inline
  def apply(
    cordova: ionicLib.Anon_Key,
    name: java.lang.String,
    version: java.lang.String,
    bin: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    description: java.lang.String = null,
    devDependencies: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    main: java.lang.String = null,
    scripts: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null
  ): CordovaPackageJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cordova")(cordova)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (main != null) __obj.updateDynamic("main")(main)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[CordovaPackageJson]
  }
}

