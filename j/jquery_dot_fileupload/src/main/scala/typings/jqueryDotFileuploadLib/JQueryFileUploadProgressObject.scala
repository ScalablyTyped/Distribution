package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadProgressObject
  extends JQueryFileInputOptions
     with JQueryFileUploadProgressAllObject

object JQueryFileUploadProgressObject {
  @scala.inline
  def apply(
    active: js.Function = null,
    add: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JqueryFileUploadAddObject, 
      scala.Unit
    ] = null,
    always: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileInputOptions, scala.Unit] = null,
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    bitrate: scala.Int | scala.Double = null,
    bitrateInterval: scala.Int | scala.Double = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChangeObject, 
      scala.Unit
    ] = null,
    chunkalways: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunkdone: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunkfail: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    chunksend: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadChunkObject, 
      scala.Unit
    ] = null,
    contentType: java.lang.String = null,
    dataType: java.lang.String = null,
    done: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit] = null,
    dragover: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    drop: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ] = null,
    dropZone: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    fail: js.Function2[/* e */ jqueryLib.JQueryEventObject, /* data */ JQueryFileUploadDone, scala.Unit] = null,
    fileInput: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    files: js.Any = null,
    forceIframeTransport: js.UndefOr[scala.Boolean] = js.undefined,
    formData: js.Any = null,
    i18n: js.Any = null,
    limitConcurrentUploads: scala.Int | scala.Double = null,
    limitMultiFileUploadSize: scala.Int | scala.Double = null,
    limitMultiFileUploadSizeOverhead: scala.Int | scala.Double = null,
    limitMultiFileUploads: scala.Int | scala.Double = null,
    loaded: scala.Int | scala.Double = null,
    maxChunkSize: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    messages: js.Any = null,
    multipart: js.UndefOr[scala.Boolean] = js.undefined,
    paramName: js.Any = null,
    paste: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadFilesObject, 
      scala.Unit
    ] = null,
    pasteZone: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    postMessage: java.lang.String = null,
    processData: js.UndefOr[scala.Boolean] = js.undefined,
    progress: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ] = null,
    progressInterval: scala.Int | scala.Double = null,
    progressall: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressAllObject, 
      scala.Unit
    ] = null,
    recalculateProgress: js.UndefOr[scala.Boolean] = js.undefined,
    redirect: java.lang.String = null,
    redirectParamName: java.lang.String = null,
    replaceFileInput: js.UndefOr[scala.Boolean] = js.undefined,
    send: js.Function2[
      /* e */ jqueryLib.JQueryEventObject, 
      /* data */ JQueryFileUploadProgressObject, 
      scala.Unit
    ] = null,
    sequentialUploads: js.UndefOr[scala.Boolean] = js.undefined,
    singleFileUploads: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    stop: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit] = null,
    submit: js.Function = null,
    timeout: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    uploadedBytes: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    xhrFields: js.Any = null
  ): JQueryFileUploadProgressObject = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (add != null) __obj.updateDynamic("add")(add)
    if (always != null) __obj.updateDynamic("always")(always)
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (bitrateInterval != null) __obj.updateDynamic("bitrateInterval")(bitrateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (change != null) __obj.updateDynamic("change")(change)
    if (chunkalways != null) __obj.updateDynamic("chunkalways")(chunkalways)
    if (chunkdone != null) __obj.updateDynamic("chunkdone")(chunkdone)
    if (chunkfail != null) __obj.updateDynamic("chunkfail")(chunkfail)
    if (chunksend != null) __obj.updateDynamic("chunksend")(chunksend)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (done != null) __obj.updateDynamic("done")(done)
    if (dragover != null) __obj.updateDynamic("dragover")(dragover)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(forceIframeTransport)) __obj.updateDynamic("forceIframeTransport")(forceIframeTransport)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (limitConcurrentUploads != null) __obj.updateDynamic("limitConcurrentUploads")(limitConcurrentUploads.asInstanceOf[js.Any])
    if (limitMultiFileUploadSize != null) __obj.updateDynamic("limitMultiFileUploadSize")(limitMultiFileUploadSize.asInstanceOf[js.Any])
    if (limitMultiFileUploadSizeOverhead != null) __obj.updateDynamic("limitMultiFileUploadSizeOverhead")(limitMultiFileUploadSizeOverhead.asInstanceOf[js.Any])
    if (limitMultiFileUploads != null) __obj.updateDynamic("limitMultiFileUploads")(limitMultiFileUploads.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (paramName != null) __obj.updateDynamic("paramName")(paramName)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (pasteZone != null) __obj.updateDynamic("pasteZone")(pasteZone.asInstanceOf[js.Any])
    if (postMessage != null) __obj.updateDynamic("postMessage")(postMessage)
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (progressall != null) __obj.updateDynamic("progressall")(progressall)
    if (!js.isUndefined(recalculateProgress)) __obj.updateDynamic("recalculateProgress")(recalculateProgress)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (redirectParamName != null) __obj.updateDynamic("redirectParamName")(redirectParamName)
    if (!js.isUndefined(replaceFileInput)) __obj.updateDynamic("replaceFileInput")(replaceFileInput)
    if (send != null) __obj.updateDynamic("send")(send)
    if (!js.isUndefined(sequentialUploads)) __obj.updateDynamic("sequentialUploads")(sequentialUploads)
    if (!js.isUndefined(singleFileUploads)) __obj.updateDynamic("singleFileUploads")(singleFileUploads)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields)
    __obj.asInstanceOf[JQueryFileUploadProgressObject]
  }
}

