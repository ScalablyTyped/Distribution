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
  def checkDeployStatus(id: java.lang.String): stdLib.Promise[DeployResult] = js.native
  def checkDeployStatus(id: java.lang.String, includeDetails: scala.Boolean): stdLib.Promise[DeployResult] = js.native
  def checkDeployStatus(
    id: java.lang.String,
    includeDetails: scala.Boolean,
    callback: jsforceLib.connectionMod.Callback[DeployResult]
  ): stdLib.Promise[DeployResult] = js.native
  def checkRetrieveStatus(id: java.lang.String): stdLib.Promise[RetrieveResult] = js.native
  def checkRetrieveStatus(id: java.lang.String, callback: jsforceLib.connectionMod.Callback[RetrieveResult]): stdLib.Promise[RetrieveResult] = js.native
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
  def create(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(`type`: java.lang.String, metadata: MetadataInfo): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def create(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(`type`: java.lang.String, metadata: MetadataInfo): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createAsync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(`type`: java.lang.String, metadata: MetadataInfo): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def createSync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: java.lang.String, fullNames: java.lang.String): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def delete(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: java.lang.String): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: js.Array[java.lang.String | MetadataInfo]): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: js.Array[java.lang.String | MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(`type`: java.lang.String, metadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteAsync(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def deleteSync(`type`: java.lang.String, fullNames: java.lang.String): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deleteSync(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def deploy(zipInput: java.lang.String, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: java.lang.String,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: nodeLib.Buffer, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: nodeLib.Buffer,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def deploy(zipInput: nodeLib.streamMod.Stream, options: DeployOptions): DeployResultLocator[AsyncResult] = js.native
  def deploy(
    zipInput: nodeLib.streamMod.Stream,
    options: DeployOptions,
    callback: jsforceLib.connectionMod.Callback[AsyncResult]
  ): DeployResultLocator[AsyncResult] = js.native
  def describe(): stdLib.Promise[DescribeMetadataResult] = js.native
  def describe(version: java.lang.String): stdLib.Promise[DescribeMetadataResult] = js.native
  def describe(version: java.lang.String, callback: jsforceLib.connectionMod.Callback[DescribeMetadataResult]): stdLib.Promise[DescribeMetadataResult] = js.native
  def list(queries: js.Array[ListMetadataQuery]): stdLib.Promise[js.Array[FileProperties]] = js.native
  def list(queries: js.Array[ListMetadataQuery], version: java.lang.String): stdLib.Promise[js.Array[FileProperties]] = js.native
  def list(
    queries: js.Array[ListMetadataQuery],
    version: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[FileProperties]]
  ): stdLib.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery): stdLib.Promise[js.Array[FileProperties]] = js.native
  def list(queries: ListMetadataQuery, version: java.lang.String): stdLib.Promise[js.Array[FileProperties]] = js.native
  def list(
    queries: ListMetadataQuery,
    version: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[FileProperties]]
  ): stdLib.Promise[js.Array[FileProperties]] = js.native
  def read(`type`: java.lang.String, fullNames: java.lang.String): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def read(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: java.lang.String, fullNames: java.lang.String): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(
    `type`: java.lang.String,
    fullNames: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(`type`: java.lang.String, fullNames: js.Array[java.lang.String]): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def readSync(
    `type`: java.lang.String,
    fullNames: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[MetadataInfo | js.Array[MetadataInfo]]
  ): stdLib.Promise[MetadataInfo | js.Array[MetadataInfo]] = js.native
  def rename(`type`: java.lang.String, oldFullName: java.lang.String, newFullName: java.lang.String): stdLib.Promise[SaveResult] = js.native
  def rename(
    `type`: java.lang.String,
    oldFullName: java.lang.String,
    newFullName: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[SaveResult]
  ): stdLib.Promise[SaveResult] = js.native
  def retrieve(request: RetrieveRequest, callback: jsforceLib.connectionMod.Callback[AsyncResult]): RetrieveResultLocator[AsyncResult] = js.native
  def update(`type`: java.lang.String, updateMetadata: js.Array[MetadataInfo]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: java.lang.String,
    updateMetadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(`type`: java.lang.String, updateMetadata: MetadataInfo): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def update(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateAsync(`type`: java.lang.String, updateMetadata: MetadataInfo): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def updateAsync(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[AsyncResult | js.Array[AsyncResult]]
  ): AsyncResultLocator[AsyncResult | js.Array[AsyncResult]] = js.native
  def updateSync(`type`: java.lang.String, updateMetadata: js.Array[MetadataInfo]): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: java.lang.String,
    updateMetadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(`type`: java.lang.String, updateMetadata: MetadataInfo): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def updateSync(
    `type`: java.lang.String,
    updateMetadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[SaveResult | js.Array[SaveResult]]
  ): stdLib.Promise[SaveResult | js.Array[SaveResult]] = js.native
  def upsert(`type`: java.lang.String, metadata: js.Array[MetadataInfo]): stdLib.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(
    `type`: java.lang.String,
    metadata: js.Array[MetadataInfo],
    callback: jsforceLib.connectionMod.Callback[UpsertResult | js.Array[UpsertResult]]
  ): stdLib.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(`type`: java.lang.String, metadata: MetadataInfo): stdLib.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
  def upsert(
    `type`: java.lang.String,
    metadata: MetadataInfo,
    callback: jsforceLib.connectionMod.Callback[UpsertResult | js.Array[UpsertResult]]
  ): stdLib.Promise[UpsertResult | js.Array[UpsertResult]] = js.native
}

