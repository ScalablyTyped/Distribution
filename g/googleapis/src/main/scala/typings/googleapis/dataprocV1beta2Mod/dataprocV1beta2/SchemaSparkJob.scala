package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache Spark (http://spark.apache.org/)
  * applications on YARN.
  */
@js.native
trait SchemaSparkJob extends js.Object {
  
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory
    * of Spark drivers and tasks. Supported file types: .jar, .tar, .tar.gz,
    * .tgz, and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments,
    * such as --conf, that can be set as job properties, since a collision may
    * occur that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. HCFS URIs of files to be copied to the working directory of
    * Spark drivers and distributed tasks. Useful for naively parallel tasks.
    */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark
    * driver and tasks.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  
  /**
    * The name of the driver&#39;s main class. The jar file that contains the
    * class must be in the default CLASSPATH or specified in jar_file_uris.
    */
  var mainClass: js.UndefOr[String] = js.native
  
  /**
    * The HCFS URI of the jar file that contains the main class.
    */
  var mainJarFileUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure Spark.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in
    * /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaSparkJob {
  
  @scala.inline
  def apply(): SchemaSparkJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkJob]
  }
  
  @scala.inline
  implicit class SchemaSparkJobOps[Self <: SchemaSparkJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchiveUrisVarargs(value: String*): Self = this.set("archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = this.set("archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveUris: Self = this.set("archiveUris", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = this.set("fileUris", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = this.set("fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUris: Self = this.set("fileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = this.set("jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = this.set("jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJarFileUris: Self = this.set("jarFileUris", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = this.set("mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("mainClass", js.undefined)
    
    @scala.inline
    def setMainJarFileUri(value: String): Self = this.set("mainJarFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainJarFileUri: Self = this.set("mainJarFileUri", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
