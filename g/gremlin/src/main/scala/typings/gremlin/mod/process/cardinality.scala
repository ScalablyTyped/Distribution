package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardinality {
  
  @JSImport("gremlin", "process.cardinality")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gremlin", "process.cardinality.list")
  @js.native
  def list: EnumValue = js.native
  inline def list_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.cardinality.set")
  @js.native
  def set: EnumValue = js.native
  inline def set_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.cardinality.single")
  @js.native
  def single: EnumValue = js.native
  inline def single_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("single")(x.asInstanceOf[js.Any])
}
