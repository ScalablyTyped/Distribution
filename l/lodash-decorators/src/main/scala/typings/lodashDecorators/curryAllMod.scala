package typings.lodashDecorators

import org.scalablytyped.runtime.Shortcut
import typings.lodashDecorators.commonMod.BiTypedDecorator1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curryAllMod extends Shortcut {
  
  @JSImport("lodash-decorators/curryAll", JSImport.Default)
  @js.native
  val default: BiTypedDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/curryAll", "CurryAll")
  @js.native
  val CurryAll_ : BiTypedDecorator1[Double] = js.native
  
  @JSImport("lodash-decorators/curryAll", "curryAll")
  @js.native
  val curryAll: BiTypedDecorator1[Double] = js.native
  
  type _To = BiTypedDecorator1[Double]
  
  /* This means you don't have to write `default`, but can instead just say `curryAllMod.foo` */
  override def _to: BiTypedDecorator1[Double] = default
}
