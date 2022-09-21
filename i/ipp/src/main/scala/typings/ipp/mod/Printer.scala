package typings.ipp.mod

import typings.ipp.ippStrings.`Cancel-Job`
import typings.ipp.ippStrings.`Create-Job`
import typings.ipp.ippStrings.`Get-Job-Attributes`
import typings.ipp.ippStrings.`Get-Jobs`
import typings.ipp.ippStrings.`Get-Printer-Attributes`
import typings.ipp.ippStrings.`Hold-Job`
import typings.ipp.ippStrings.`Pause-Printer`
import typings.ipp.ippStrings.`Print-Job`
import typings.ipp.ippStrings.`Print-URI`
import typings.ipp.ippStrings.`Purge-Jobs`
import typings.ipp.ippStrings.`Release-Job`
import typings.ipp.ippStrings.`Restart-Job`
import typings.ipp.ippStrings.`Resume-Printer`
import typings.ipp.ippStrings.`Send-Document`
import typings.ipp.ippStrings.`Send-URI`
import typings.ipp.ippStrings.`Validate-Job`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipp", "Printer")
@js.native
open class Printer protected () extends StObject {
  def this(url: String) = this()
  def this(url: String, options: PrinterOptions) = this()
  
  def execute(operation: `Cancel-Job` | `Release-Job`, message: CancelReleaseJobRequest): Unit = js.native
  def execute(
    operation: `Cancel-Job` | `Release-Job`,
    message: CancelReleaseJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  def execute(operation: `Hold-Job` | `Restart-Job`, message: HoldRestartJobRequest): Unit = js.native
  def execute(
    operation: `Hold-Job` | `Restart-Job`,
    message: HoldRestartJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  def execute(operation: `Pause-Printer` | `Resume-Printer` | `Purge-Jobs`, message: SimpleRequest): Unit = js.native
  def execute(
    operation: `Pause-Printer` | `Resume-Printer` | `Purge-Jobs`,
    message: SimpleRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  def execute(operation: PrinterOpertaion): Unit = js.native
  def execute(
    operation: PrinterOpertaion,
    message: Unit,
    callback: js.Function2[/* error */ js.Error, /* response */ FullResponse, Unit]
  ): Unit = js.native
  def execute(operation: PrinterOpertaion, message: FullRequest): Unit = js.native
  def execute(
    operation: PrinterOpertaion,
    message: FullRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ FullResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_CreateJob(operation: `Create-Job`, message: CreateJobRequest): Unit = js.native
  @JSName("execute")
  def execute_CreateJob(
    operation: `Create-Job`,
    message: CreateJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetJobAttributes(operation: `Get-Job-Attributes`, message: GetJobAttributesRequest): Unit = js.native
  @JSName("execute")
  def execute_GetJobAttributes(
    operation: `Get-Job-Attributes`,
    message: GetJobAttributesRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetJobAttributesResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetJobs(operation: `Get-Jobs`, message: GetJobsRequest): Unit = js.native
  @JSName("execute")
  def execute_GetJobs(
    operation: `Get-Jobs`,
    message: GetJobsRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetJobsResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_GetPrinterAttributes(operation: `Get-Printer-Attributes`, message: GetPrinterAttributesRequest): Unit = js.native
  @JSName("execute")
  def execute_GetPrinterAttributes(
    operation: `Get-Printer-Attributes`,
    message: GetPrinterAttributesRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ GetPrinterAttributesResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PrintJob(operation: `Print-Job`, message: PrintJobRequest): Unit = js.native
  @JSName("execute")
  def execute_PrintJob(
    operation: `Print-Job`,
    message: PrintJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ PrintJobResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_PrintURI(operation: `Print-URI`, message: PrintURIRequest): Unit = js.native
  @JSName("execute")
  def execute_PrintURI(
    operation: `Print-URI`,
    message: PrintURIRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ PrintJobResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_SendDocument(operation: `Send-Document`, message: SendDocumentRequest): Unit = js.native
  @JSName("execute")
  def execute_SendDocument(
    operation: `Send-Document`,
    message: SendDocumentRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SendDocumentResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_SendURI(operation: `Send-URI`, message: SendURIRequest): Unit = js.native
  @JSName("execute")
  def execute_SendURI(
    operation: `Send-URI`,
    message: SendURIRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
  @JSName("execute")
  def execute_ValidateJob(operation: `Validate-Job`, message: ValidateJobRequest): Unit = js.native
  @JSName("execute")
  def execute_ValidateJob(
    operation: `Validate-Job`,
    message: ValidateJobRequest,
    callback: js.Function2[/* error */ js.Error, /* response */ SimpleResponse, Unit]
  ): Unit = js.native
}
