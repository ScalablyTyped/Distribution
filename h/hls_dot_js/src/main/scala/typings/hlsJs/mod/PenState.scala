package typings.hlsJs.mod

import typings.hlsJs.anon.PartialPenStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PenState extends StObject {
  
  var background: String
  
  def copy(newPenState: PenState): Unit
  
  def equals(other: PenState): Boolean
  
  var flash: Boolean
  
  var foreground: String
  
  def isDefault(): Boolean
  
  var italics: Boolean
  
  def reset(): Unit
  
  def setStyles(styles: PartialPenStyles): Unit
  
  var underline: Boolean
}
object PenState {
  
  inline def apply(
    background: String,
    copy: PenState => Unit,
    equals_ : PenState => Boolean,
    flash: Boolean,
    foreground: String,
    isDefault: () => Boolean,
    italics: Boolean,
    reset: () => Unit,
    setStyles: PartialPenStyles => Unit,
    underline: Boolean
  ): PenState = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), flash = flash.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], isDefault = js.Any.fromFunction0(isDefault), italics = italics.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), setStyles = js.Any.fromFunction1(setStyles), underline = underline.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PenState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PenState] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: PenState => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: PenState => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: () => Boolean): Self = StObject.set(x, "isDefault", js.Any.fromFunction0(value))
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetStyles(value: PartialPenStyles => Unit): Self = StObject.set(x, "setStyles", js.Any.fromFunction1(value))
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
