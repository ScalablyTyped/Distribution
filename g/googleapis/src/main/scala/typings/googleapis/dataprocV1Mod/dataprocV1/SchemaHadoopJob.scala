package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache Hadoop MapReduce
  * (https://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html)
  * jobs on Apache Hadoop YARN
  * (https://hadoop.apache.org/docs/r2.7.1/hadoop-yarn/hadoop-yarn-site/YARN.html).
  */
@js.native
trait SchemaHadoopJob extends StObject {
  
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory
    * of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz,
    * .tgz, or .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments,
    * such as -libjars or -Dfoo=bar, that can be set as job properties, since a
    * collision may occur that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied
    * to the working directory of Hadoop drivers and distributed tasks. Useful
    * for naively parallel tasks.
    */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and
    * tasks.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  
  /**
    * The name of the driver&#39;s main class. The jar file containing the
    * class must be in the default CLASSPATH or specified in jar_file_uris.
    */
  var mainClass: js.UndefOr[String] = js.native
  
  /**
    * The HCFS URI of the jar file containing the main class. Examples:
    * &#39;gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar&#39;
    * &#39;hdfs:/tmp/test-samples/custom-wordcount.jar&#39;
    * &#39;file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar&#39;
    */
  var mainJarFileUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure
    * Hadoop. Properties that conflict with values set by the Cloud Dataproc
    * API may be overwritten. Can include properties set in
    * /etc/hadoop/conf/ *-site and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaHadoopJob {
  
  @scala.inline
  def apply(): SchemaHadoopJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHadoopJob]
  }
  
  @scala.inline
  implicit class SchemaHadoopJobMutableBuilder[Self <: SchemaHadoopJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    @scala.inline
    def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value :_*))
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
    
    @scala.inline
    def setMainJarFileUri(value: String): Self = StObject.set(x, "mainJarFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainJarFileUriUndefined: Self = StObject.set(x, "mainJarFileUri", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
