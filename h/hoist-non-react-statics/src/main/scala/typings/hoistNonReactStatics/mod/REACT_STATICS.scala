package typings.hoistNonReactStatics.mod

import typings.hoistNonReactStatics.hoistNonReactStaticsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait REACT_STATICS extends js.Object {
  
  var childContextTypes: `true` = js.native
  
  var contextType: `true` = js.native
  
  var contextTypes: `true` = js.native
  
  var defaultProps: `true` = js.native
  
  var displayName: `true` = js.native
  
  var getDefaultProps: `true` = js.native
  
  var getDerivedStateFromError: `true` = js.native
  
  var getDerivedStateFromProps: `true` = js.native
  
  var mixins: `true` = js.native
  
  var propTypes: `true` = js.native
  
  var `type`: `true` = js.native
}
object REACT_STATICS {
  
  @scala.inline
  def apply(
    childContextTypes: `true`,
    contextType: `true`,
    contextTypes: `true`,
    defaultProps: `true`,
    displayName: `true`,
    getDefaultProps: `true`,
    getDerivedStateFromError: `true`,
    getDerivedStateFromProps: `true`,
    mixins: `true`,
    propTypes: `true`,
    `type`: `true`
  ): REACT_STATICS = {
    val __obj = js.Dynamic.literal(childContextTypes = childContextTypes.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], contextTypes = contextTypes.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getDefaultProps = getDefaultProps.asInstanceOf[js.Any], getDerivedStateFromError = getDerivedStateFromError.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[REACT_STATICS]
  }
  
  @scala.inline
  implicit class REACT_STATICSOps[Self <: REACT_STATICS] (val x: Self) extends AnyVal {
    
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
    def setChildContextTypes(value: `true`): Self = this.set("childContextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextType(value: `true`): Self = this.set("contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTypes(value: `true`): Self = this.set("contextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProps(value: `true`): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: `true`): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultProps(value: `true`): Self = this.set("getDefaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDerivedStateFromError(value: `true`): Self = this.set("getDerivedStateFromError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDerivedStateFromProps(value: `true`): Self = this.set("getDerivedStateFromProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixins(value: `true`): Self = this.set("mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypes(value: `true`): Self = this.set("propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `true`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
