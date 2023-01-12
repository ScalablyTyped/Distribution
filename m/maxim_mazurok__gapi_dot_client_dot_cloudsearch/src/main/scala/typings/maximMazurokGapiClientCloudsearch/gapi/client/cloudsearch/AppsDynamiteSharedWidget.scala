package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedWidget extends StObject {
  
  /**
    * A list of buttons. For example, the following JSON creates two buttons. The first is a filled text button and the second is an image button that opens a link: ``` "buttonList": {
    * "buttons": [ "button": { "text": "Edit", "Color": { "Red": 255 "Green": 255 "Blue": 255 } "disabled": true }, "button": { "icon": { "knownIcon": "INVITE" "altText": "check calendar"
    * }, "onClick": { "openLink": { "url": "https://example.com/calendar" } } }, ] } ```
    */
  var buttonList: js.UndefOr[AppsDynamiteSharedButtonList] = js.undefined
  
  /**
    * Displays a single row of columns with widgets stacked vertically in each column. For example, the following JSON creates a 2 column widget each containing a single item. ```
    * "columns": { "wrapStyle": "WRAP", "columnItems": [ { "horizontalSizeStyle": "FILL_AVAILABLE_SPACE", "horizontalAlignment": "CENTER", "verticalAlignment" : "CENTER", "widgets": [ {
    * "textParagraph": { "text": "First column text paragraph", } } ] }, { "horizontalSizeStyle": "FILL_AVAILABLE_SPACE", "horizontalAlignment": "CENTER", "verticalAlignment" : "CENTER",
    * "widgets": [ { "textParagraph": { "text": "Second column text paragraph", } } ] }, ] } } ```
    */
  var columns: js.UndefOr[AppsDynamiteSharedColumns] = js.undefined
  
  /**
    * Displays a selection/input widget for date/time. For example, the following JSON creates a date/time picker for an appointment time: ``` "date_time_picker": { "name":
    * "appointment_time", "label": "Book your appointment at:", "type": "DateTimePickerType.DATE_AND_TIME", "valueMsEpoch": "796435200000" } ```
    */
  var dateTimePicker: js.UndefOr[AppsDynamiteSharedDateTimePicker] = js.undefined
  
  /**
    * Displays a decorated text item in this widget. For example, the following JSON creates a decorated text widget showing email address: ``` "decoratedText": { "icon": { "knownIcon":
    * "EMAIL" }, "topLabel": "Email Address", "content": "heba.salam@example.com", "bottomLabel": "This is a new Email address!", "switchWidget": { "name":
    * "has_send_welcome_email_to_heba_salam", "selected": false, "controlType": "ControlType.CHECKBOX" } } ```
    */
  var decoratedText: js.UndefOr[AppsDynamiteSharedDecoratedText] = js.undefined
  
  /** Displays a divider. For example, the following JSON creates a divider: ``` "divider": { } ``` */
  var divider: js.UndefOr[Any] = js.undefined
  
  /**
    * Displays a grid with a collection of items. For example, the following JSON creates a 2 column grid with a single item: ``` "grid": { "title": "A fine collection of items",
    * "numColumns": 2, "borderStyle": { "type": "STROKE", "cornerRadius": 4.0 }, "items": [ "image": { "imageUri": "https://www.example.com/image.png", "cropStyle": { "type": "SQUARE" },
    * "borderStyle": { "type": "STROKE" } }, "title": "An item", "textAlignment": "CENTER" ], "onClick": { "openLink": { "url":"https://www.example.com" } } } ```
    */
  var grid: js.UndefOr[AppsDynamiteSharedGrid] = js.undefined
  
  /** The horizontal alignment of this widget. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * Displays an image in this widget. For example, the following JSON creates an image with alternative text: ``` "image": { "imageUrl": "https://example.com/heba_salam.png" "altText":
    * "Avatar for Heba Salam" } ```
    */
  var image: js.UndefOr[AppsDynamiteSharedImage] = js.undefined
  
  /**
    * Displays a switch control in this widget. For example, the following JSON creates a dropdown selection for size: ``` "switchControl": { "name": "size", "label": "Size" "type":
    * "SelectionType.DROPDOWN", "items": [ { "text": "S", "value": "small", "selected": false }, { "text": "M", "value": "medium", "selected": true }, { "text": "L", "value": "large",
    * "selected": false }, { "text": "XL", "value": "extra_large", "selected": false } ] } ```
    */
  var selectionInput: js.UndefOr[AppsDynamiteSharedSelectionInput] = js.undefined
  
  /**
    * Displays a text input in this widget. For example, the following JSON creates a text input for mail address: ``` "textInput": { "name": "mailing_address", "label": "Mailing Address"
    * } ``` As another example, the following JSON creates a text input for programming language with static suggestions: ``` "textInput": { "name": "preferred_programing_language",
    * "label": "Preferred Language", "initialSuggestions": { "items": [ { "text": "C++" }, { "text": "Java" }, { "text": "JavaScript" }, { "text": "Python" } ] } } ```
    */
  var textInput: js.UndefOr[AppsDynamiteSharedTextInput] = js.undefined
  
  /** Displays a text paragraph in this widget. For example, the following JSON creates a bolded text: ``` "textParagraph": { "text": " *bold text*" } ``` */
  var textParagraph: js.UndefOr[AppsDynamiteSharedTextParagraph] = js.undefined
}
object AppsDynamiteSharedWidget {
  
  inline def apply(): AppsDynamiteSharedWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedWidget] (val x: Self) extends AnyVal {
    
    inline def setButtonList(value: AppsDynamiteSharedButtonList): Self = StObject.set(x, "buttonList", value.asInstanceOf[js.Any])
    
    inline def setButtonListUndefined: Self = StObject.set(x, "buttonList", js.undefined)
    
    inline def setColumns(value: AppsDynamiteSharedColumns): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setDateTimePicker(value: AppsDynamiteSharedDateTimePicker): Self = StObject.set(x, "dateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "dateTimePicker", js.undefined)
    
    inline def setDecoratedText(value: AppsDynamiteSharedDecoratedText): Self = StObject.set(x, "decoratedText", value.asInstanceOf[js.Any])
    
    inline def setDecoratedTextUndefined: Self = StObject.set(x, "decoratedText", js.undefined)
    
    inline def setDivider(value: Any): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setGrid(value: AppsDynamiteSharedGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setImage(value: AppsDynamiteSharedImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSelectionInput(value: AppsDynamiteSharedSelectionInput): Self = StObject.set(x, "selectionInput", value.asInstanceOf[js.Any])
    
    inline def setSelectionInputUndefined: Self = StObject.set(x, "selectionInput", js.undefined)
    
    inline def setTextInput(value: AppsDynamiteSharedTextInput): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    
    inline def setTextParagraph(value: AppsDynamiteSharedTextParagraph): Self = StObject.set(x, "textParagraph", value.asInstanceOf[js.Any])
    
    inline def setTextParagraphUndefined: Self = StObject.set(x, "textParagraph", js.undefined)
  }
}
