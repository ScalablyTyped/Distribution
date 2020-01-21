package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache Hadoop MapReduce
  * (https://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html)
  * jobs on Apache Hadoop YARN
  * (https://hadoop.apache.org/docs/r2.7.1/hadoop-yarn/hadoop-yarn-site/YARN.html).
  */
@js.native
trait SchemaHadoopJob extends js.Object {
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
  def apply(
    archiveUris: js.Array[String] = null,
    args: js.Array[String] = null,
    fileUris: js.Array[String] = null,
    jarFileUris: js.Array[String] = null,
    loggingConfig: SchemaLoggingConfig = null,
    mainClass: String = null,
    mainJarFileUri: String = null,
    properties: StringDictionary[String] = null
  ): SchemaHadoopJob = {
    val __obj = js.Dynamic.literal()
    if (archiveUris != null) __obj.updateDynamic("archiveUris")(archiveUris.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (fileUris != null) __obj.updateDynamic("fileUris")(fileUris.asInstanceOf[js.Any])
    if (jarFileUris != null) __obj.updateDynamic("jarFileUris")(jarFileUris.asInstanceOf[js.Any])
    if (loggingConfig != null) __obj.updateDynamic("loggingConfig")(loggingConfig.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (mainJarFileUri != null) __obj.updateDynamic("mainJarFileUri")(mainJarFileUri.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHadoopJob]
  }
}

