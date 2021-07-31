package typings.jsforce.metadataMod

import typings.jsforce.connectionMod.Callback
import typings.jsforce.connectionMod.Connection
import typings.node.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/api/metadata", "Metadata")
@js.native
class Metadata protected () extends StObject {
  def this(conn: Connection) = this()
  
  def checkDeployStatus(id: String): js.Promise[DeployResult] = js.native
  def checkDeployStatus(id: String, includeDetails: Boolean): js.Promise[DeployResult] = js.native
  def checkDeployStatus(id: String, includeDetails: Boolean, callback: Callback[DeployResult]): js.Promise[DeployResult] = js.native
  def checkDeployStatus(id: String, includeDetails: Unit, callback: Callback[DeployResult]): js.Promise[DeployResult] = js.native
  
  def checkRetrieveStatus(id: String): js.Promise[RetrieveResult] = js.native
  def checkRetrieveStatus(id: String, callback: Callback[RetrieveResult]): js.Promise[RetrieveResult] = js.native
  
  def checkStatus(ids: String): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(ids: String, callback: Callback[AsyncResult | js.Array[AsyncResult]]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(ids: js.Array[String]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(ids: js.Array[String], callback: Callback[AsyncResult | js.Array[AsyncResult]]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  
  def create(`type`: String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(
    `type`: String,
    metadata: js.Array[MetadataInfo],
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(`type`: String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(`type`: String, metadata: MetadataInfo, callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def createAsync(`type`: String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(
    `type`: String,
    metadata: js.Array[MetadataInfo],
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: String, metadata: MetadataInfo, callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def createSync(`type`: String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(
    `type`: String,
    metadata: js.Array[MetadataInfo],
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: String, metadata: MetadataInfo, callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def delete(`type`: String, fullNames: String): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: String, fullNames: String, callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: String, fullNames: js.Array[String]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: String, fullNames: js.Array[String], callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def deleteAsync(`type`: String, metadata: String): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: String, metadata: String, callback: Callback[AsyncResult | js.Array[AsyncResult]]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: String, metadata: js.Array[MetadataInfo | String]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: String,
    metadata: js.Array[MetadataInfo | String],
    callback: Callback[js.Array[AsyncResult] | AsyncResult]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: String, metadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: String, metadata: MetadataInfo, callback: Callback[AsyncResult | js.Array[AsyncResult]]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  
  def deleteSync(`type`: String, fullNames: String): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(`type`: String, fullNames: String, callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(`type`: String, fullNames: js.Array[String]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(`type`: String, fullNames: js.Array[String], callback: Callback[SaveResult | js.Array[SaveResult]]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def deploy(zipInput: String, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: String, options: DeployOptions, callback: Callback[AsyncResult]): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: Buffer, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: Buffer, options: DeployOptions, callback: Callback[AsyncResult]): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: Stream, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: Stream, options: DeployOptions, callback: Callback[AsyncResult]): DeployResultLocator[AsyncResult] = js.native
  
  def describe(): js.Promise[DescribeMetadataResult] = js.native
  def describe(version: String): js.Promise[DescribeMetadataResult] = js.native
  def describe(version: String, callback: Callback[DescribeMetadataResult]): js.Promise[DescribeMetadataResult] = js.native
  def describe(version: Unit, callback: Callback[DescribeMetadataResult]): js.Promise[DescribeMetadataResult] = js.native
  
  def list(queries: js.Array[ListMetadataQuery]): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: js.Array[ListMetadataQuery], version: String): js.Promise[js.Array[FileProperties]] = js.native
  def list(
    queries: js.Array[ListMetadataQuery],
    version: String,
    callback: Callback[js.Array[FileProperties]]
  ): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: js.Array[ListMetadataQuery], version: Unit, callback: Callback[js.Array[FileProperties]]): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery, version: String): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery, version: String, callback: Callback[js.Array[FileProperties]]): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery, version: Unit, callback: Callback[js.Array[FileProperties]]): js.Promise[js.Array[FileProperties]] = js.native
  
  var pollInterval: Double = js.native
  
  var pollTimeout: Double = js.native
  
  def read(`type`: String, fullNames: String): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(`type`: String, fullNames: String, callback: Callback[MetadataInfo | js.Array[MetadataInfo]]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(`type`: String, fullNames: js.Array[String]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(
    `type`: String,
    fullNames: js.Array[String],
    callback: Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  
  def readSync(`type`: String, fullNames: String): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: String, fullNames: String, callback: Callback[MetadataInfo | js.Array[MetadataInfo]]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: String, fullNames: js.Array[String]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(
    `type`: String,
    fullNames: js.Array[String],
    callback: Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  
  def rename(`type`: String, oldFullName: String, newFullName: String): js.Promise[SaveResult] = js.native
  def rename(`type`: String, oldFullName: String, newFullName: String, callback: Callback[SaveResult]): js.Promise[SaveResult] = js.native
  
  def retrieve(request: RetrieveRequest): RetrieveResultLocator[AsyncResult] = js.native
  def retrieve(request: RetrieveRequest, callback: Callback[AsyncResult]): RetrieveResultLocator[AsyncResult] = js.native
  
  def update(`type`: String, updateMetadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: String,
    updateMetadata: js.Array[MetadataInfo],
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(`type`: String, updateMetadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: String,
    updateMetadata: MetadataInfo,
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def updateAsync(`type`: String, updateMetadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def updateAsync(
    `type`: String,
    updateMetadata: MetadataInfo,
    callback: Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  
  def updateSync(`type`: String, updateMetadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: String,
    updateMetadata: js.Array[MetadataInfo],
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(`type`: String, updateMetadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: String,
    updateMetadata: MetadataInfo,
    callback: Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  
  def upsert(`type`: String, metadata: js.Array[MetadataInfo]): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(
    `type`: String,
    metadata: js.Array[MetadataInfo],
    callback: Callback[UpsertResult | js.Array[UpsertResult]]
  ): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(`type`: String, metadata: MetadataInfo): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(`type`: String, metadata: MetadataInfo, callback: Callback[UpsertResult | js.Array[UpsertResult]]): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
}
