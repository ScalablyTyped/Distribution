package typings.ionic.ionic1Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BowerJson extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var devDependencies: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var name: String
}

object BowerJson {
  @scala.inline
  def apply(
    name: String,
    dependencies: StringDictionary[js.UndefOr[String]] = null,
    devDependencies: StringDictionary[js.UndefOr[String]] = null
  ): BowerJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (devDependencies != null) __obj.updateDynamic("devDependencies")(devDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[BowerJson]
  }
}

