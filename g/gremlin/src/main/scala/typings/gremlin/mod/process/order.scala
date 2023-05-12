package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object order {
  
  @JSImport("gremlin", "process.order")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gremlin", "process.order.asc")
  @js.native
  def asc: EnumValue = js.native
  inline def asc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asc")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.order.desc")
  @js.native
  def desc: EnumValue = js.native
  inline def desc_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desc")(x.asInstanceOf[js.Any])
  
  @JSImport("gremlin", "process.order.shuffle")
  @js.native
  def shuffle: EnumValue = js.native
  inline def shuffle_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(x.asInstanceOf[js.Any])
}
