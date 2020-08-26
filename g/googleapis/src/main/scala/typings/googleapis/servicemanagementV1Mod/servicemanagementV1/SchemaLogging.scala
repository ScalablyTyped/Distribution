package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logging configuration of the service.  The following example shows how to
  * configure logs to be sent to the producer and consumer projects. In the
  * example, the `activity_history` log is sent to both the producer and
  * consumer projects, whereas the `purchase_history` log is only sent to the
  * producer project.      monitored_resources:     - type:
  * library.googleapis.com/branch       labels:       - key: /city description:
  * The city where the library branch is located in.       - key: /name
  * description: The name of the branch.     logs:     - name: activity_history
  * labels:       - key: /customer_id     - name: purchase_history     logging:
  * producer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         logs:         - activity_history -
  * purchase_history       consumer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         logs:         - activity_history
  */
@js.native
trait SchemaLogging extends js.Object {
  /**
    * Logging configurations for sending logs to the consumer project. There
    * can be multiple consumer destinations, each one must have a different
    * monitored resource type. A log can be used in at most one consumer
    * destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.native
  /**
    * Logging configurations for sending logs to the producer project. There
    * can be multiple producer destinations, each one must have a different
    * monitored resource type. A log can be used in at most one producer
    * destination.
    */
  var producerDestinations: js.UndefOr[js.Array[SchemaLoggingDestination]] = js.native
}

object SchemaLogging {
  @scala.inline
  def apply(): SchemaLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogging]
  }
  @scala.inline
  implicit class SchemaLoggingOps[Self <: SchemaLogging] (val x: Self) extends AnyVal {
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
    def setConsumerDestinationsVarargs(value: SchemaLoggingDestination*): Self = this.set("consumerDestinations", js.Array(value :_*))
    @scala.inline
    def setConsumerDestinations(value: js.Array[SchemaLoggingDestination]): Self = this.set("consumerDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerDestinations: Self = this.set("consumerDestinations", js.undefined)
    @scala.inline
    def setProducerDestinationsVarargs(value: SchemaLoggingDestination*): Self = this.set("producerDestinations", js.Array(value :_*))
    @scala.inline
    def setProducerDestinations(value: js.Array[SchemaLoggingDestination]): Self = this.set("producerDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerDestinations: Self = this.set("producerDestinations", js.undefined)
  }
  
}

