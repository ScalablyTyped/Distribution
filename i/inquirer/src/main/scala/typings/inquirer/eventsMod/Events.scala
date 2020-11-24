package typings.inquirer.eventsMod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of events.
  */
@js.native
trait Events extends js.Object {
  
  /**
    * The event-flow of the `aKey`-event.
    */
  var aKey: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `iKey`-event.
    */
  var iKey: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `keypress`-event of the readline-object.
    */
  var keypress: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `line`-event of the readline-object.
    */
  var line: Observable_[String] = js.native
  
  /**
    * The event-flow of the `normalizedDownKey`-event.
    */
  var normalizedDownKey: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `normalizedUpKey`-event.
    */
  var normalizedUpKey: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `numberKey`-event.
    */
  var numberKey: Observable_[KeyDescriptor] = js.native
  
  /**
    * The event-flow of the `spaceKey`-event.
    */
  var spaceKey: Observable_[KeyDescriptor] = js.native
}
object Events {
  
  @scala.inline
  def apply(
    aKey: Observable_[KeyDescriptor],
    iKey: Observable_[KeyDescriptor],
    keypress: Observable_[KeyDescriptor],
    line: Observable_[String],
    normalizedDownKey: Observable_[KeyDescriptor],
    normalizedUpKey: Observable_[KeyDescriptor],
    numberKey: Observable_[KeyDescriptor],
    spaceKey: Observable_[KeyDescriptor]
  ): Events = {
    val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setAKey(value: Observable_[KeyDescriptor]): Self = this.set("aKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIKey(value: Observable_[KeyDescriptor]): Self = this.set("iKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypress(value: Observable_[KeyDescriptor]): Self = this.set("keypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Observable_[String]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedDownKey(value: Observable_[KeyDescriptor]): Self = this.set("normalizedDownKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedUpKey(value: Observable_[KeyDescriptor]): Self = this.set("normalizedUpKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberKey(value: Observable_[KeyDescriptor]): Self = this.set("numberKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceKey(value: Observable_[KeyDescriptor]): Self = this.set("spaceKey", value.asInstanceOf[js.Any])
  }
}
