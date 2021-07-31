package typings.jqueryFileupload

import typings.jquery.JQueryEventObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface options for the plugin
trait JQueryFileInputOptions extends StObject {
  
  var active: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The add callback is invoked as soon as files are added to the fileupload
    * widget (via file input selection, drag & drop, paste or add API call).
    * If the singleFileUploads option is enabled, this callback will be
    * called once for each file in the selection for XHR file uploads, else
    * once for each file selection.
    *
    * The upload starts when the submit method is invoked on the data parameter.
    * The data object contains a files property holding the added files
    * and allows you to override plugin options as well as define ajax settings.
    *
    * Listeners for this callback can also be bound the following way:
    * .bind('fileuploadadd', func);
    *
    * data.submit() returns a Promise object and allows to attach additional
    * handlers using jQuery's Deferred callbacks:
    * data.submit().done(func).fail(func).always(func);
    */
  var add: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject, Unit]
  ] = js.undefined
  
  var always: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ this.type, Unit]] = js.undefined
  
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[Double] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject, Unit]
  ] = js.undefined
  
  var chunkalways: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunkdone: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunkfail: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunksend: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  var done: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  
  var dragover: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  var drop: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  var fail: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  var files: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[js.Any] = js.undefined
  
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[Double] = js.undefined
  
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[Double] = js.undefined
  
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.undefined
  
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.undefined
  
  var paste: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[String] = js.undefined
  
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[Double] = js.undefined
  
  var progressall: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject, Unit]
  ] = js.undefined
  
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[String] = js.undefined
  
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[String] = js.undefined
  
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[Boolean] = js.undefined
  
  var send: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[Double] = js.undefined
  
  // Others
  var url: js.UndefOr[String] = js.undefined
  
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.undefined
}
object JQueryFileInputOptions {
  
  @scala.inline
  def apply(): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
  
  @scala.inline
  implicit class JQueryFileInputOptionsMutableBuilder[Self <: JQueryFileInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: js.Function): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdd(value: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAlways(value: (/* e */ JQueryEventObject, JQueryFileInputOptions) => Unit): Self = StObject.set(x, "always", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    @scala.inline
    def setBitrateInterval(value: Double): Self = StObject.set(x, "bitrateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateIntervalUndefined: Self = StObject.set(x, "bitrateInterval", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setChange(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChunkalways(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = StObject.set(x, "chunkalways", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChunkalwaysUndefined: Self = StObject.set(x, "chunkalways", js.undefined)
    
    @scala.inline
    def setChunkdone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = StObject.set(x, "chunkdone", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChunkdoneUndefined: Self = StObject.set(x, "chunkdone", js.undefined)
    
    @scala.inline
    def setChunkfail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = StObject.set(x, "chunkfail", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChunkfailUndefined: Self = StObject.set(x, "chunkfail", js.undefined)
    
    @scala.inline
    def setChunksend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Unit): Self = StObject.set(x, "chunksend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChunksendUndefined: Self = StObject.set(x, "chunksend", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setDragover(value: /* e */ JQueryEventObject => Unit): Self = StObject.set(x, "dragover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
    
    @scala.inline
    def setDrop(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setDropZone(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
    
    @scala.inline
    def setDropZoneVarargs(value: Element*): Self = StObject.set(x, "dropZone", js.Array(value :_*))
    
    @scala.inline
    def setFail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFileInput(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
    
    @scala.inline
    def setFileInputVarargs(value: Element*): Self = StObject.set(x, "fileInput", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setForceIframeTransport(value: Boolean): Self = StObject.set(x, "forceIframeTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIframeTransportUndefined: Self = StObject.set(x, "forceIframeTransport", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setI18n(value: js.Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setLimitConcurrentUploads(value: Double): Self = StObject.set(x, "limitConcurrentUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitConcurrentUploadsUndefined: Self = StObject.set(x, "limitConcurrentUploads", js.undefined)
    
    @scala.inline
    def setLimitMultiFileUploadSize(value: Double): Self = StObject.set(x, "limitMultiFileUploadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitMultiFileUploadSizeOverhead(value: Double): Self = StObject.set(x, "limitMultiFileUploadSizeOverhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitMultiFileUploadSizeOverheadUndefined: Self = StObject.set(x, "limitMultiFileUploadSizeOverhead", js.undefined)
    
    @scala.inline
    def setLimitMultiFileUploadSizeUndefined: Self = StObject.set(x, "limitMultiFileUploadSize", js.undefined)
    
    @scala.inline
    def setLimitMultiFileUploads(value: Double): Self = StObject.set(x, "limitMultiFileUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitMultiFileUploadsUndefined: Self = StObject.set(x, "limitMultiFileUploads", js.undefined)
    
    @scala.inline
    def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setParamName(value: js.Any): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
    
    @scala.inline
    def setPaste(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    @scala.inline
    def setPasteZone(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "pasteZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteZoneUndefined: Self = StObject.set(x, "pasteZone", js.undefined)
    
    @scala.inline
    def setPasteZoneVarargs(value: Element*): Self = StObject.set(x, "pasteZone", js.Array(value :_*))
    
    @scala.inline
    def setPostMessage(value: String): Self = StObject.set(x, "postMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
    
    @scala.inline
    def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    @scala.inline
    def setProgress(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setProgressall(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Unit): Self = StObject.set(x, "progressall", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgressallUndefined: Self = StObject.set(x, "progressall", js.undefined)
    
    @scala.inline
    def setRecalculateProgress(value: Boolean): Self = StObject.set(x, "recalculateProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecalculateProgressUndefined: Self = StObject.set(x, "recalculateProgress", js.undefined)
    
    @scala.inline
    def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectParamName(value: String): Self = StObject.set(x, "redirectParamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectParamNameUndefined: Self = StObject.set(x, "redirectParamName", js.undefined)
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setReplaceFileInput(value: Boolean): Self = StObject.set(x, "replaceFileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceFileInputUndefined: Self = StObject.set(x, "replaceFileInput", js.undefined)
    
    @scala.inline
    def setSend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    @scala.inline
    def setSequentialUploads(value: Boolean): Self = StObject.set(x, "sequentialUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequentialUploadsUndefined: Self = StObject.set(x, "sequentialUploads", js.undefined)
    
    @scala.inline
    def setSingleFileUploads(value: Boolean): Self = StObject.set(x, "singleFileUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleFileUploadsUndefined: Self = StObject.set(x, "singleFileUploads", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ JQueryEventObject => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: /* e */ JQueryEventObject => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setSubmit(value: js.Function): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUploadedBytes(value: Double): Self = StObject.set(x, "uploadedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedBytesUndefined: Self = StObject.set(x, "uploadedBytes", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXhrFields(value: js.Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
