package typings.jxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jxon", "stringify")
@js.native
object stringify extends js.Object {
  def apply(objTree: js.Object): String = js.native
  def apply(
    objTree: js.Object,
    namespaceURI: js.UndefOr[scala.Nothing],
    qualifiedName: js.UndefOr[scala.Nothing],
    documentType: js.Object
  ): String = js.native
  def apply(objTree: js.Object, namespaceURI: js.UndefOr[scala.Nothing], qualifiedName: String): String = js.native
  def apply(
    objTree: js.Object,
    namespaceURI: js.UndefOr[scala.Nothing],
    qualifiedName: String,
    documentType: js.Object
  ): String = js.native
  def apply(objTree: js.Object, namespaceURI: String): String = js.native
  def apply(
    objTree: js.Object,
    namespaceURI: String,
    qualifiedName: js.UndefOr[scala.Nothing],
    documentType: js.Object
  ): String = js.native
  def apply(objTree: js.Object, namespaceURI: String, qualifiedName: String): String = js.native
  def apply(objTree: js.Object, namespaceURI: String, qualifiedName: String, documentType: js.Object): String = js.native
}

