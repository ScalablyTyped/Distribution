package typings.gun

import org.scalablytyped.runtime.Shortcut
import typings.gun.gunStrings.pre_root
import typings.gun.mod.Gun.ChainReference
import typings.gun.mod.Gun.Constructor
import typings.gun.mod.Gun.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gunMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("gun/gun", JSImport.Namespace)
  @js.native
  class ^[DataType] ()
    extends StObject
       with ChainReference[DataType, js.Any, pre_root] {
    def this(options: String) = this()
    def this(options: js.Array[String]) = this()
    def this(options: ConstructorOptions) = this()
  }
  @JSImport("gun/gun", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `gunMod.foo` */
  override def _to: js.Object & Constructor = ^
}
