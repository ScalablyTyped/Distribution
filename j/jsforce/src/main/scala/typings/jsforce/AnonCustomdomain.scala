package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomdomain extends js.Object {
  var custom_domain: js.UndefOr[String] = js.undefined
  var enterprise: String
  var feed_elements: String
  var feed_items: String
  var feeds: String
  var groups: String
  var metadata: String
  var partner: String
  var profile: String
  var query: String
  var recent: String
  var rest: String
  var search: String
  var sobjects: String
  var tooling_rest: String
  var tooling_soap: String
  var users: String
}

object AnonCustomdomain {
  @scala.inline
  def apply(
    enterprise: String,
    feed_elements: String,
    feed_items: String,
    feeds: String,
    groups: String,
    metadata: String,
    partner: String,
    profile: String,
    query: String,
    recent: String,
    rest: String,
    search: String,
    sobjects: String,
    tooling_rest: String,
    tooling_soap: String,
    users: String,
    custom_domain: String = null
  ): AnonCustomdomain = {
    val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], feed_elements = feed_elements.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feeds = feeds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], partner = partner.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any], tooling_rest = tooling_rest.asInstanceOf[js.Any], tooling_soap = tooling_soap.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (custom_domain != null) __obj.updateDynamic("custom_domain")(custom_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomdomain]
  }
}

