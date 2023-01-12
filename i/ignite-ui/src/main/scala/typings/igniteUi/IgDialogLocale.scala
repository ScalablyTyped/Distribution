package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDialogLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets the title/tooltip for the close button in the dialog.
    *
    */
  var closeButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the title/tooltip for the maximize button in the dialog.
    *
    */
  var maximizeButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the title/tooltip for the minimize button in the dialog.
    *
    */
  var minimizeButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the title/tooltip for the pin button in the dialog.
    *
    */
  var pinButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the title/tooltip for the restore button in the dialog.
    *
    */
  var restoreButtonTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the title/tooltip for the pin button in the dialog.
    *
    */
  var unpinButtonTitle: js.UndefOr[String] = js.undefined
}
object IgDialogLocale {
  
  inline def apply(): IgDialogLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDialogLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgDialogLocale] (val x: Self) extends AnyVal {
    
    inline def setCloseButtonTitle(value: String): Self = StObject.set(x, "closeButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonTitleUndefined: Self = StObject.set(x, "closeButtonTitle", js.undefined)
    
    inline def setMaximizeButtonTitle(value: String): Self = StObject.set(x, "maximizeButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setMaximizeButtonTitleUndefined: Self = StObject.set(x, "maximizeButtonTitle", js.undefined)
    
    inline def setMinimizeButtonTitle(value: String): Self = StObject.set(x, "minimizeButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setMinimizeButtonTitleUndefined: Self = StObject.set(x, "minimizeButtonTitle", js.undefined)
    
    inline def setPinButtonTitle(value: String): Self = StObject.set(x, "pinButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setPinButtonTitleUndefined: Self = StObject.set(x, "pinButtonTitle", js.undefined)
    
    inline def setRestoreButtonTitle(value: String): Self = StObject.set(x, "restoreButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setRestoreButtonTitleUndefined: Self = StObject.set(x, "restoreButtonTitle", js.undefined)
    
    inline def setUnpinButtonTitle(value: String): Self = StObject.set(x, "unpinButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setUnpinButtonTitleUndefined: Self = StObject.set(x, "unpinButtonTitle", js.undefined)
  }
}
