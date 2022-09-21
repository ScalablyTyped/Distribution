package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "TextStyle")
@js.native
/* private */ open class TextStyle () extends StObject {
  
  def asNormal(): TextStyle = js.native
  
  def asStandalone(): TextStyle = js.native
  
  def isStandalone(): Boolean = js.native
  
  def toJSON(): String = js.native
}
/* static members */
object TextStyle {
  
  @JSImport("@js-joda/core", "TextStyle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "TextStyle.FULL")
  @js.native
  def FULL: TextStyle = js.native
  inline def FULL_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "TextStyle.FULL_STANDALONE")
  @js.native
  def FULL_STANDALONE: TextStyle = js.native
  inline def FULL_STANDALONE_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL_STANDALONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "TextStyle.NARROW")
  @js.native
  def NARROW: TextStyle = js.native
  inline def NARROW_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NARROW")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "TextStyle.NARROW_STANDALONE")
  @js.native
  def NARROW_STANDALONE: TextStyle = js.native
  inline def NARROW_STANDALONE_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NARROW_STANDALONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "TextStyle.SHORT")
  @js.native
  def SHORT: TextStyle = js.native
  inline def SHORT_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "TextStyle.SHORT_STANDALONE")
  @js.native
  def SHORT_STANDALONE: TextStyle = js.native
  inline def SHORT_STANDALONE_=(x: TextStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT_STANDALONE")(x.asInstanceOf[js.Any])
}
