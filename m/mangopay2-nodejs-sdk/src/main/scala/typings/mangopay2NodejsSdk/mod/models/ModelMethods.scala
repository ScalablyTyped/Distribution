package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.baseMod.base.DependsObject
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelMethods[T /* <: js.Object */] extends StObject {
  
  /**
    * Returns object property value
    * @param attribute
    */
  def getData[K /* <: /* keyof T */ String */](attribute: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def getDependsObjects(): js.Array[DependsObject] = js.native
  
  def getReadOnlyProperties(): js.Array[/* keyof T */ String] = js.native
  
  def initialize(): Unit = js.native
  
  def parse(): Unit = js.native
  
  def setData(attribute: Partial[T]): this.type = js.native
  /**
    * @param attribute   - attribute's value to be set or hash of properties with values
    * @param value       - value to be set
    */
  def setData[K /* <: /* keyof T */ String */](
    attribute: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
}
