package typings.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var bin: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var name: String
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var version: String
}

object PackageJson {
  @scala.inline
  def apply(
    name: String,
    version: String,
    bin: StringDictionary[js.UndefOr[String]] = null,
    dependencies: StringDictionary[js.UndefOr[String]] = null,
    description: String = null,
    devDependencies: StringDictionary[js.UndefOr[String]] = null,
    main: String = null,
    scripts: StringDictionary[js.UndefOr[String]] = null
  ): PackageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (bin != null) __obj.updateDynamic("bin")(bin.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
}

