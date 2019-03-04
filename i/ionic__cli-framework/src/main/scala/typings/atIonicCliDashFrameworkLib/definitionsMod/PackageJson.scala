package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJson extends js.Object {
  var bin: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var dependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var devDependencies: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var scripts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var version: java.lang.String
}

object PackageJson {
  @scala.inline
  def apply(
    name: java.lang.String,
    version: java.lang.String,
    bin: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    description: java.lang.String = null,
    devDependencies: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    main: java.lang.String = null,
    scripts: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null
  ): PackageJson = {
    val __obj = js.Dynamic.literal(name = name, version = version)
    if (bin != null) __obj.updateDynamic("bin")(bin)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies)
    if (main != null) __obj.updateDynamic("main")(main)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[PackageJson]
  }
}

