package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import typings.jasmine.anon.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order
  extends Instantiable1[/* options */ Random, js.Any] {
  
  var random: Boolean = js.native
  
  var seed: String = js.native
  
  def sort[T](items: js.Array[T]): js.Array[T] = js.native
}
