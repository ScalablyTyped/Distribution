package typings.jupyterlabDocumentsearch.searchoverlayMod.createSearchOverlay

import typings.jupyterlabDocumentsearch.interfacesMod.IDisplayState
import typings.jupyterlabDocumentsearch.searchinstanceMod.SearchInstance
import typings.luminoSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var hasOutputs: Boolean = js.native
  
  var isReadOnly: Boolean = js.native
  
  var onCaseSensitiveToggled: js.Function = js.native
  
  var onEndSearch: js.Function = js.native
  
  var onHighlightPrevious: js.Function = js.native
  
  var onHightlightNext: js.Function = js.native
  
  var onRegexToggled: js.Function = js.native
  
  var onReplaceAll: js.Function = js.native
  
  var onReplaceCurrent: js.Function = js.native
  
  var onStartQuery: js.Function = js.native
  
  var overlayState: IDisplayState = js.native
  
  var widgetChanged: Signal[SearchInstance, IDisplayState] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    hasOutputs: Boolean,
    isReadOnly: Boolean,
    onCaseSensitiveToggled: js.Function,
    onEndSearch: js.Function,
    onHighlightPrevious: js.Function,
    onHightlightNext: js.Function,
    onRegexToggled: js.Function,
    onReplaceAll: js.Function,
    onReplaceCurrent: js.Function,
    onStartQuery: js.Function,
    overlayState: IDisplayState,
    widgetChanged: Signal[SearchInstance, IDisplayState]
  ): IOptions = {
    val __obj = js.Dynamic.literal(hasOutputs = hasOutputs.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], onCaseSensitiveToggled = onCaseSensitiveToggled.asInstanceOf[js.Any], onEndSearch = onEndSearch.asInstanceOf[js.Any], onHighlightPrevious = onHighlightPrevious.asInstanceOf[js.Any], onHightlightNext = onHightlightNext.asInstanceOf[js.Any], onRegexToggled = onRegexToggled.asInstanceOf[js.Any], onReplaceAll = onReplaceAll.asInstanceOf[js.Any], onReplaceCurrent = onReplaceCurrent.asInstanceOf[js.Any], onStartQuery = onStartQuery.asInstanceOf[js.Any], overlayState = overlayState.asInstanceOf[js.Any], widgetChanged = widgetChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasOutputs(value: Boolean): Self = this.set("hasOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCaseSensitiveToggled(value: js.Function): Self = this.set("onCaseSensitiveToggled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndSearch(value: js.Function): Self = this.set("onEndSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHighlightPrevious(value: js.Function): Self = this.set("onHighlightPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHightlightNext(value: js.Function): Self = this.set("onHightlightNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRegexToggled(value: js.Function): Self = this.set("onRegexToggled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReplaceAll(value: js.Function): Self = this.set("onReplaceAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReplaceCurrent(value: js.Function): Self = this.set("onReplaceCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartQuery(value: js.Function): Self = this.set("onStartQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayState(value: IDisplayState): Self = this.set("overlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetChanged(value: Signal[SearchInstance, IDisplayState]): Self = this.set("widgetChanged", value.asInstanceOf[js.Any])
  }
}
