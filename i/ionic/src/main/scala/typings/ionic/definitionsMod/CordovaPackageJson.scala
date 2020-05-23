package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.anon.Platforms
import typings.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPackageJson extends PackageJson {
  var cordova: Platforms
}

object CordovaPackageJson {
  @scala.inline
  def apply(
    cordova: Platforms,
    name: String,
    version: String,
    bin: StringDictionary[js.UndefOr[String]] = null,
    dependencies: StringDictionary[js.UndefOr[String]] = null,
    description: String = null,
    devDependencies: StringDictionary[js.UndefOr[String]] = null,
    main: String = null,
    scripts: StringDictionary[js.UndefOr[String]] = null
  ): CordovaPackageJson = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPackageJson]
  }
}

