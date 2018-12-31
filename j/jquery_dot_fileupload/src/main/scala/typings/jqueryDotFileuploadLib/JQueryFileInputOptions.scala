package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface options for the plugin
trait JQueryFileInputOptions extends js.Object {
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
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JqueryFileUploadAddObject, 
      scala.Unit
    ]
  ] = js.undefined
  var always: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileInputOptions, scala.Unit]
  ] = js.undefined
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[scala.Double] = js.undefined
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChangeObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkalways: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkdone: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunkfail: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var chunksend: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var done: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit]
  ] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  var drop: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  var fail: js.UndefOr[
    js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit]
  ] = js.undefined
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  var files: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[scala.Boolean] = js.undefined
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
  var limitConcurrentUploads: js.UndefOr[scala.Double] = js.undefined
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[scala.Double] = js.undefined
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[scala.Double] = js.undefined
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[scala.Double] = js.undefined
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[js.Any] = js.undefined
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[js.Any] = js.undefined
  var paste: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[java.lang.String] = js.undefined
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[scala.Boolean] = js.undefined
  var progress: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[scala.Double] = js.undefined
  var progressall: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressAllObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[scala.Boolean] = js.undefined
  var send: js.UndefOr[
    js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]] = js.undefined
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[scala.Double] = js.undefined
  // Others
  var url: js.UndefOr[java.lang.String] = js.undefined
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[js.Any] = js.undefined
}

