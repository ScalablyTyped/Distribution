package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesApi extends StObject {
  
  /**
    * Add template
    *
    * Add a new template.
    */
  def add(body: TemplatesAddRequest): js.Promise[TemplateResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete template
    *
    * Delete a template.
    */
  def delete(body: TemplatesFindByNameRequest): js.Promise[TemplateResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get template info
    *
    * Get the information for an existing template.
    */
  def info(body: TemplatesFindByNameRequest): js.Promise[TemplateResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List templates
    *
    * Return a list of all the templates available to this user.
    */
  def list(): js.Promise[js.Array[TemplateResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: TemplatesListRequest): js.Promise[js.Array[TemplateResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Publish template content
    *
    * Publish the content for the template. Any new messages sent using this template will start
    * using the content that was previously in draft.
    */
  def publish(body: TemplatesFindByNameRequest): js.Promise[TemplateResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Render html template
    *
    * Inject content and optionally merge fields into a template, returning the HTML that results.
    */
  def render(body: TemplatesRenderRequest): js.Promise[TemplatesRenderResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get template history
    *
    * Return the recent history (hourly stats for the last 30 days) for a template.
    */
  def timeSeries(body: TemplatesFindByNameRequest): js.Promise[js.Array[TimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Update template
    *
    * Update the code for an existing template. If null is provided for any fields, the values will
    * remain unchanged.
    */
  def update(body: TemplatesUpdateRequest): js.Promise[TemplateResponse | (AxiosError[Any, Any])] = js.native
}
