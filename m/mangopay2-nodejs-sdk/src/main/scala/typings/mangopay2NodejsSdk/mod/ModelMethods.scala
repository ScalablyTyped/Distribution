package typings.mangopay2NodejsSdk.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMethods[T /* <: js.Object */] extends js.Object {
  /**
    * Returns object property value
    * @param attribute
    */
  def getData[K /* <: String */](attribute: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  def getDependsObjects(): js.Array[DependsObject] = js.native
  def getReadOnlyProperties(): js.Array[String] = js.native
  def initialize(): Unit = js.native
  def parse(): Unit = js.native
  def setData(attribute: Partial[T]): this.type = js.native
  /**
    * @param attribute   - attribute's value to be set or hash of properties with values
    * @param value       - value to be set
    */
  def setData[K /* <: String */](
    attribute: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
}

