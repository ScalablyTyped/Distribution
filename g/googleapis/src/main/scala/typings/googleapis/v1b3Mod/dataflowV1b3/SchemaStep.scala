package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a particular step within a Cloud Dataflow job.  A job consists of
  * multiple steps, each of which performs some specific operation as part of
  * the overall job.  Data is typically passed from one step to another as part
  * of the job.  Here&#39;s an example of a sequence of steps which together
  * implement a Map-Reduce job:    * Read a collection of data from some
  * source, parsing the     collection&#39;s elements.    * Validate the
  * elements.    * Apply a user-defined function to map each element to some
  * value     and extract an element-specific key value.    * Group elements
  * with the same key into a single element with     that key, transforming a
  * multiply-keyed collection into a     uniquely-keyed collection.    * Write
  * the elements out to some data sink.  Note that the Cloud Dataflow service
  * may be used to run many different types of jobs, not just Map-Reduce.
  */
@js.native
trait SchemaStep extends StObject {
  
  /**
    * The kind of step in the Cloud Dataflow job.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name that identifies the step. This must be unique for each step with
    * respect to all other steps in the Cloud Dataflow job.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Named properties associated with the step. Each kind of predefined step
    * has its own required set of properties. Must be provided on Create.  Only
    * retrieved with JOB_VIEW_ALL.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaStep {
  
  @scala.inline
  def apply(): SchemaStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStep]
  }
  
  @scala.inline
  implicit class SchemaStepMutableBuilder[Self <: SchemaStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
