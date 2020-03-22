package typings.mangopay2NodejsSdk.mod.uboDeclaration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUboDeclaration extends js.Object {
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.undefined
}

object CreateUboDeclaration {
  @scala.inline
  def apply(DeclaredUBOs: js.Array[String] = null): CreateUboDeclaration = {
    val __obj = js.Dynamic.literal()
    if (DeclaredUBOs != null) __obj.updateDynamic("DeclaredUBOs")(DeclaredUBOs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUboDeclaration]
  }
}

