package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Change indicates the most recent state of an element.
  */
trait SchemaGoogleWatcherV1Change extends StObject {
  
  /**
    * If true, this Change is followed by more Changes that are in the same
    * group as this Change.
    */
  var continued: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The actual change data. This field is present only when `state() ==
    * EXISTS` or `state() == ERROR`. Please see google.protobuf.Any about how
    * to use the Any type.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Name of the element, interpreted relative to the entity&#39;s actual
    * name. &quot;&quot; refers to the entity itself. The element name is a
    * valid UTF-8 string.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * If present, provides a compact representation of all the messages that
    * have been received by the caller for the given entity, e.g., it could be
    * a sequence number or a multi-part timestamp/version vector. This marker
    * can be provided in the Request message, allowing the caller to resume the
    * stream watching at a specific point without fetching the initial state.
    */
  var resumeMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the `element`.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleWatcherV1Change {
  
  inline def apply(): SchemaGoogleWatcherV1Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleWatcherV1Change]
  }
  
  extension [Self <: SchemaGoogleWatcherV1Change](x: Self) {
    
    inline def setContinued(value: Boolean): Self = StObject.set(x, "continued", value.asInstanceOf[js.Any])
    
    inline def setContinuedUndefined: Self = StObject.set(x, "continued", js.undefined)
    
    inline def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setResumeMarker(value: String): Self = StObject.set(x, "resumeMarker", value.asInstanceOf[js.Any])
    
    inline def setResumeMarkerUndefined: Self = StObject.set(x, "resumeMarker", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
