package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.typingsBaseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.typingsBaseMod.base.WithResponse
import typings.mangopay2NodejsSdk.typingsModelsReportMod.report.CreateReport
import typings.mangopay2NodejsSdk.typingsModelsReportMod.report.ReportData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsServicesReportsMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Reports", "Reports")
  @js.native
  open class Reports () extends StObject {
    
    /**
      * Create a report
      * @param report
      * @param options
      */
    def create(data: CreateReport): js.Promise[ReportData] = js.native
    /**
      * Create a report
      * @param report
      * @param options
      */
    def create(data: CreateReport, callback: js.Function1[/* data */ ReportData, Unit]): Unit = js.native
    /**
      * Create a report
      * @param report
      * @param options
      */
    def create(
      data: CreateReport,
      callback: js.Function1[/* data */ WithResponse[ReportData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def create(
      data: CreateReport,
      callback: js.Function1[/* data */ ReportData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Create a report
      * @param report
      * @param options
      */
    def create(data: CreateReport, options: MethodOptionWithResponse): js.Promise[WithResponse[ReportData]] = js.native
    def create(data: CreateReport, options: MethodOptionWithoutResponse): js.Promise[ReportData] = js.native
    /**
      * Create a report
      * @param report
      * @param options
      */
    @JSName("create")
    var create_Original: MethodOverload[CreateReport, ReportData] = js.native
    
    /**
      * Get a report
      * @param reportId
      * @param options
      */
    def get(data: String): js.Promise[ReportData] = js.native
    /**
      * Get a report
      * @param reportId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ ReportData, Unit]): Unit = js.native
    /**
      * Get a report
      * @param reportId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[ReportData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ ReportData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get a report
      * @param reportId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[ReportData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[ReportData] = js.native
    
    /**
      * Get all reports
      * @param options
      */
    def getAll(): js.Promise[js.Array[ReportData]] = js.native
    /**
      * Get all reports
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[ReportData]) | (/* data */ WithResponse[js.Array[ReportData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[ReportData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ js.Array[ReportData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all reports
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[ReportData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[ReportData]] = js.native
    /**
      * Get all reports
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[ReportData]] = js.native
    
    /**
      * Get a report
      * @param reportId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, ReportData] = js.native
  }
}
