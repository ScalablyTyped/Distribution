package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Billing related configuration of the service.  The following example shows
  * how to configure monitored resources and metrics for billing:
  * monitored_resources:     - type: library.googleapis.com/branch labels: -
  * key: /city         description: The city where the library branch is
  * located in.       - key: /name         description: The name of the branch.
  * metrics:     - name: library.googleapis.com/book/borrowed_count
  * metric_kind: DELTA       value_type: INT64     billing:
  * consumer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/borrowed_count
  */
@js.native
trait SchemaBilling extends js.Object {
  /**
    * Billing configurations for sending metrics to the consumer project. There
    * can be multiple consumer destinations per service, each one must have a
    * different monitored resource type. A metric can be used in at most one
    * consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaBillingDestination]] = js.native
}

object SchemaBilling {
  @scala.inline
  def apply(): SchemaBilling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBilling]
  }
  @scala.inline
  implicit class SchemaBillingOps[Self <: SchemaBilling] (val x: Self) extends AnyVal {
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
    def setConsumerDestinationsVarargs(value: SchemaBillingDestination*): Self = this.set("consumerDestinations", js.Array(value :_*))
    @scala.inline
    def setConsumerDestinations(value: js.Array[SchemaBillingDestination]): Self = this.set("consumerDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerDestinations: Self = this.set("consumerDestinations", js.undefined)
  }
  
}

