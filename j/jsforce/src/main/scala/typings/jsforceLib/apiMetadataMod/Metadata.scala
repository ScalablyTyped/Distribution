package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/metadata", "Metadata")
@js.native
class Metadata protected () extends js.Object {
  def this(conn: jsforceLib.connectionMod.Connection) = this()
  var pollInterval: scala.Double = js.native
  var pollTimeout: scala.Double = js.native
  def checkDeployStatus(id: java.lang.String): js.Promise[DeployResult] = js.native
  def checkDeployStatus(id: java.lang.String, includeDetails: scala.Boolean): js.Promise[DeployResult] = js.native
  def checkDeployStatus(
    id: java.lang.String,
    includeDetails: scala.Boolean,
    callback: jsforceLib.connectionMod.Callback[DeployResult]
  ): js.Promise[DeployResult] = js.native
  def checkRetrieveStatus(id: java.lang.String): js.Promise[RetrieveResult] = js.native
  def checkRetrieveStatus(id: java.lang.String, callback: jsforceLib.connectionMod.Callback[RetrieveResult]): js.Promise[RetrieveResult] = js.native
  def checkStatus(ids: java.lang.String): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(
    ids: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(ids: js.Array[java.lang.String]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def checkStatus(
    ids: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def create(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(`type`: java.lang.String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: java.lang.String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: java.lang.String, metadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: java.lang.String, fullNames: java.lang.String): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: java.lang.String): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: js.Array[MetadataInfo | java.lang.String]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo | java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[AsyncResult] | AsyncResult]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteSync(`type`: java.lang.String, fullNames: java.lang.String): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deploy(zipInput: java.lang.String, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: java.lang.String,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: nodeLib.bufferMod.Buffer, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: nodeLib.bufferMod.Buffer,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: nodeLib.streamMod.Stream, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: nodeLib.streamMod.Stream,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def describe(): js.Promise[DescribeMetadataResult] = js.native
  def describe(version: java.lang.String): js.Promise[DescribeMetadataResult] = js.native
  def describe(version: java.lang.String, callback: jsforceLib.connectionMod.Callback[DescribeMetadataResult]): js.Promise[DescribeMetadataResult] = js.native
  def list(queries: js.Array[ListMetadataQuery]): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: js.Array[ListMetadataQuery], version: java.lang.String): js.Promise[js.Array[FileProperties]] = js.native
  def list(
    queries: js.Array[ListMetadataQuery],
    version: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[FileProperties]]
  ): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery): js.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery, version: java.lang.String): js.Promise[js.Array[FileProperties]] = js.native
  def list(
    queries: ListMetadataQuery,
    version: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[FileProperties]]
  ): js.Promise[js.Array[FileProperties]] = js.native
  def read(`type`: java.lang.String, fullNames: java.lang.String): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: java.lang.String, fullNames: java.lang.String): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): js.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def rename(`type`: java.lang.String, oldFullName: java.lang.String, newFullName: java.lang.String): js.Promise[SaveResult] = js.native
  def rename(
    `type`: java.lang.String,
    oldFullName: java.lang.String,
    newFullName: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult]
  ): js.Promise[SaveResult] = js.native
  def retrieve(request: RetrieveRequest): RetrieveResultLocator[AsyncResult] = js.native
  def retrieve(request: RetrieveRequest, callback: jsforceLib.connectionMod.Callback[AsyncResult]): RetrieveResultLocator[AsyncResult] = js.native
  def update(`type`: java.lang.String, updateMetadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: java.lang.String,
    updateMetadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(`type`: java.lang.String, updateMetadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateAsync(`type`: java.lang.String, updateMetadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def updateAsync(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def updateSync(`type`: java.lang.String, updateMetadata: js.Array[MetadataInfo]): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: java.lang.String,
    updateMetadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(`type`: java.lang.String, updateMetadata: MetadataInfo): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): js.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def upsert(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[UpsertResult | js.Array[UpsertResult]]
  ): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(`type`: java.lang.String, metadata: MetadataInfo): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[UpsertResult | js.Array[UpsertResult]]
  ): js.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
}

