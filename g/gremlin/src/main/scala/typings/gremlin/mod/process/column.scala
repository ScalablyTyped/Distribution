package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object column {
  
  @JSImport("gremlin", "process.column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gremlin", "process.column.keys")
  @js.native
  def keys: EnumValue = js.native
  inline def keys_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.column.values")
  @js.native
  def values: EnumValue = js.native
  inline def values_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
}
