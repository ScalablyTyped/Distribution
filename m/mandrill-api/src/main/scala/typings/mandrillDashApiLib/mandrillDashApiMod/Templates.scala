package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Templates")
@js.native
class Templates protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
       * Add a new template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name for the new template - must be unique
       * @option params {String} from_email a default sending address for emails sent using this template
       * @option params {String} from_name a default from name to be used
       * @option params {String} subject a default subject line to be used
       * @option params {String} code the HTML code for the template with mc:edit attributes for the editable elements
       * @option params {String} text a default text part to be used when sending with this template
       * @option params {Boolean} publish set to false to add a draft template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any): scala.Unit = js.native
  /**
       * Add a new template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name for the new template - must be unique
       * @option params {String} from_email a default sending address for emails sent using this template
       * @option params {String} from_name a default from name to be used
       * @option params {String} subject a default subject line to be used
       * @option params {String} code the HTML code for the template with mc:edit attributes for the editable elements
       * @option params {String} text a default text part to be used when sending with this template
       * @option params {Boolean} publish set to false to add a draft template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Add a new template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name for the new template - must be unique
       * @option params {String} from_email a default sending address for emails sent using this template
       * @option params {String} from_name a default from name to be used
       * @option params {String} subject a default subject line to be used
       * @option params {String} code the HTML code for the template with mc:edit attributes for the editable elements
       * @option params {String} text a default text part to be used when sending with this template
       * @option params {Boolean} publish set to false to add a draft template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Delete a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any): scala.Unit = js.native
  /**
       * Delete a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Delete a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Get the information for an existing template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any): scala.Unit = js.native
  /**
       * Get the information for an existing template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Get the information for an existing template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Return a list of all the templates available to this user
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} label an optional label to filter the templates
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any): scala.Unit = js.native
  /**
       * Return a list of all the templates available to this user
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} label an optional label to filter the templates
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Return a list of all the templates available to this user
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} label an optional label to filter the templates
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def publish(params: js.Any): scala.Unit = js.native
  /**
       * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def publish(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def publish(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Inject content and optionally merge fields into a template, returning the HTML that results
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} template_name the immutable name of a template that exists in the user's account
       * @option params {Array} template_content an array of template content to render.  Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block
       *    - template_content[] {Object} the injection of a single piece of content into a single editable region
       *        - name {String} the name of the mc:edit editable region to inject into
       *        - content {String} the content to inject
       * @option params {Array} merge_vars optional merge variables to use for injecting merge field content.  If this is not provided, no merge fields will be replaced.
       *    - merge_vars[] {Object} a single merge variable
       *        - name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
       *        - content {String} the merge variable's content
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def render(params: js.Any): scala.Unit = js.native
  /**
       * Inject content and optionally merge fields into a template, returning the HTML that results
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} template_name the immutable name of a template that exists in the user's account
       * @option params {Array} template_content an array of template content to render.  Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block
       *    - template_content[] {Object} the injection of a single piece of content into a single editable region
       *        - name {String} the name of the mc:edit editable region to inject into
       *        - content {String} the content to inject
       * @option params {Array} merge_vars optional merge variables to use for injecting merge field content.  If this is not provided, no merge fields will be replaced.
       *    - merge_vars[] {Object} a single merge variable
       *        - name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
       *        - content {String} the merge variable's content
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def render(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Inject content and optionally merge fields into a template, returning the HTML that results
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} template_name the immutable name of a template that exists in the user's account
       * @option params {Array} template_content an array of template content to render.  Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block
       *    - template_content[] {Object} the injection of a single piece of content into a single editable region
       *        - name {String} the name of the mc:edit editable region to inject into
       *        - content {String} the content to inject
       * @option params {Array} merge_vars optional merge variables to use for injecting merge field content.  If this is not provided, no merge fields will be replaced.
       *    - merge_vars[] {Object} a single merge variable
       *        - name {String} the merge variable's name. Merge variable names are case-insensitive and may not start with _
       *        - content {String} the merge variable's content
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def render(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Return the recent history (hourly stats for the last 30 days) for a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def timeSeries(params: js.Any): scala.Unit = js.native
  /**
       * Return the recent history (hourly stats for the last 30 days) for a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def timeSeries(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Return the recent history (hourly stats for the last 30 days) for a template
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the name of an existing template
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @option params {String} from_email the new default sending address
       * @option params {String} from_name the new default from name
       * @option params {String} subject the new default subject line
       * @option params {String} code the new code for the template
       * @option params {String} text the new default text part to be used
       * @option params {Boolean} publish set to false to update the draft version of the template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any): scala.Unit = js.native
  /**
       * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @option params {String} from_email the new default sending address
       * @option params {String} from_name the new default from name
       * @option params {String} subject the new default subject line
       * @option params {String} code the new code for the template
       * @option params {String} text the new default text part to be used
       * @option params {Boolean} publish set to false to update the draft version of the template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the immutable name of an existing template
       * @option params {String} from_email the new default sending address
       * @option params {String} from_name the new default from name
       * @option params {String} subject the new default subject line
       * @option params {String} code the new code for the template
       * @option params {String} text the new default text part to be used
       * @option params {Boolean} publish set to false to update the draft version of the template without publishing
       * @option params {Array} labels an optional array of up to 10 labels to use for filtering templates
       *    - labels[] {String} a single label
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

