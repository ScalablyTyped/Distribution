package typings.inquirer.eventsMod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of events.
  */
trait Events extends js.Object {
  /**
    * The event-flow of the `aKey`-event.
    */
  var aKey: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `iKey`-event.
    */
  var iKey: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `keypress`-event of the readline-object.
    */
  var keypress: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `line`-event of the readline-object.
    */
  var line: Observable_[String]
  /**
    * The event-flow of the `normalizedDownKey`-event.
    */
  var normalizedDownKey: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `normalizedUpKey`-event.
    */
  var normalizedUpKey: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `numberKey`-event.
    */
  var numberKey: Observable_[KeyDescriptor]
  /**
    * The event-flow of the `spaceKey`-event.
    */
  var spaceKey: Observable_[KeyDescriptor]
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
}

