package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Int64")
@js.native
open class Int64 ()
  extends typings.kdbxweb.int64Mod.Int64 {
  def this(lo: Double) = this()
  def this(lo: Double, hi: Double) = this()
  def this(lo: Unit, hi: Double) = this()
}
object Int64 {
  
  @JSImport("kdbxweb", "Int64")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from(value: Double): typings.kdbxweb.int64Mod.Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.kdbxweb.int64Mod.Int64]
}
