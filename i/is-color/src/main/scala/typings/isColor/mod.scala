package typings.isColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(str: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isCurrentColor(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrentColor")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHex(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHsl(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHsl")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHsla(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHsla")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInherit(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInherit")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isKeyword(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeyword")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRgb(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRgb")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRgba(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRgba")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTransparent(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransparent")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
