package typings.keenTracking

import org.scalablytyped.runtime.StringDictionary
import typings.keenTracking.anon.Collections
import typings.keenTracking.anon.Config
import typings.keenTracking.anon.Created
import typings.keenTracking.anon.Host
import typings.keenTracking.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("keen-tracking", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with KeenTracking {
    def this(options: ProjectId) = this()
    
    /* CompleteClass */
    override def extendEvents(payload: Any): KeenClient = js.native
    
    /* CompleteClass */
    override def initAutoTracking(config: KeenAutoTrackingConfig): KeenClient = js.native
    
    /* CompleteClass */
    override def recordEvent(collectionName: String, event: js.Object): js.Promise[Created] = js.native
    
    /* CompleteClass */
    override def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
  }
  
  trait KeenAutoTrackingConfig extends StObject {
    
    var collectIpAddress: js.UndefOr[Boolean] = js.undefined
    
    var collectUuid: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDisabledFormFields: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFormFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var recordClicks: js.UndefOr[Boolean] = js.undefined
    
    var recordClicksPositionPointer: js.UndefOr[Boolean] = js.undefined
    
    var recordElementViews: js.UndefOr[Boolean] = js.undefined
    
    var recordFormSubmits: js.UndefOr[Boolean] = js.undefined
    
    var recordPageViews: js.UndefOr[Boolean] = js.undefined
    
    var recordPageViewsOnExit: js.UndefOr[Boolean] = js.undefined
    
    var recordScrollState: js.UndefOr[Boolean] = js.undefined
    
    var shareUuidAcrossDomains: js.UndefOr[Boolean] = js.undefined
  }
  object KeenAutoTrackingConfig {
    
    inline def apply(): KeenAutoTrackingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeenAutoTrackingConfig]
    }
    
    extension [Self <: KeenAutoTrackingConfig](x: Self) {
      
      inline def setCollectIpAddress(value: Boolean): Self = StObject.set(x, "collectIpAddress", value.asInstanceOf[js.Any])
      
      inline def setCollectIpAddressUndefined: Self = StObject.set(x, "collectIpAddress", js.undefined)
      
      inline def setCollectUuid(value: Boolean): Self = StObject.set(x, "collectUuid", value.asInstanceOf[js.Any])
      
      inline def setCollectUuidUndefined: Self = StObject.set(x, "collectUuid", js.undefined)
      
      inline def setIgnoreDisabledFormFields(value: Boolean): Self = StObject.set(x, "ignoreDisabledFormFields", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDisabledFormFieldsUndefined: Self = StObject.set(x, "ignoreDisabledFormFields", js.undefined)
      
      inline def setIgnoreFormFieldTypes(value: js.Array[String]): Self = StObject.set(x, "ignoreFormFieldTypes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFormFieldTypesUndefined: Self = StObject.set(x, "ignoreFormFieldTypes", js.undefined)
      
      inline def setIgnoreFormFieldTypesVarargs(value: String*): Self = StObject.set(x, "ignoreFormFieldTypes", js.Array(value*))
      
      inline def setRecordClicks(value: Boolean): Self = StObject.set(x, "recordClicks", value.asInstanceOf[js.Any])
      
      inline def setRecordClicksPositionPointer(value: Boolean): Self = StObject.set(x, "recordClicksPositionPointer", value.asInstanceOf[js.Any])
      
      inline def setRecordClicksPositionPointerUndefined: Self = StObject.set(x, "recordClicksPositionPointer", js.undefined)
      
      inline def setRecordClicksUndefined: Self = StObject.set(x, "recordClicks", js.undefined)
      
      inline def setRecordElementViews(value: Boolean): Self = StObject.set(x, "recordElementViews", value.asInstanceOf[js.Any])
      
      inline def setRecordElementViewsUndefined: Self = StObject.set(x, "recordElementViews", js.undefined)
      
      inline def setRecordFormSubmits(value: Boolean): Self = StObject.set(x, "recordFormSubmits", value.asInstanceOf[js.Any])
      
      inline def setRecordFormSubmitsUndefined: Self = StObject.set(x, "recordFormSubmits", js.undefined)
      
      inline def setRecordPageViews(value: Boolean): Self = StObject.set(x, "recordPageViews", value.asInstanceOf[js.Any])
      
      inline def setRecordPageViewsOnExit(value: Boolean): Self = StObject.set(x, "recordPageViewsOnExit", value.asInstanceOf[js.Any])
      
      inline def setRecordPageViewsOnExitUndefined: Self = StObject.set(x, "recordPageViewsOnExit", js.undefined)
      
      inline def setRecordPageViewsUndefined: Self = StObject.set(x, "recordPageViews", js.undefined)
      
      inline def setRecordScrollState(value: Boolean): Self = StObject.set(x, "recordScrollState", value.asInstanceOf[js.Any])
      
      inline def setRecordScrollStateUndefined: Self = StObject.set(x, "recordScrollState", js.undefined)
      
      inline def setShareUuidAcrossDomains(value: Boolean): Self = StObject.set(x, "shareUuidAcrossDomains", value.asInstanceOf[js.Any])
      
      inline def setShareUuidAcrossDomainsUndefined: Self = StObject.set(x, "shareUuidAcrossDomains", js.undefined)
    }
  }
  
  trait KeenClient extends StObject {
    
    var config: Host
    
    var extensions: Collections
    
    var queue: Config
  }
  object KeenClient {
    
    inline def apply(config: Host, extensions: Collections, queue: Config): KeenClient = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeenClient]
    }
    
    extension [Self <: KeenClient](x: Self) {
      
      inline def setConfig(value: Host): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: Collections): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: Config): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeenTracking extends StObject {
    
    def extendEvents(payload: Any): KeenClient
    
    def initAutoTracking(config: KeenAutoTrackingConfig): KeenClient
    
    def recordEvent(collectionName: String, event: js.Object): js.Promise[Created]
    
    def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]]
  }
  object KeenTracking {
    
    inline def apply(
      extendEvents: Any => KeenClient,
      initAutoTracking: KeenAutoTrackingConfig => KeenClient,
      recordEvent: (String, js.Object) => js.Promise[Created],
      recordEvents: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]
    ): KeenTracking = {
      val __obj = js.Dynamic.literal(extendEvents = js.Any.fromFunction1(extendEvents), initAutoTracking = js.Any.fromFunction1(initAutoTracking), recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
      __obj.asInstanceOf[KeenTracking]
    }
    
    extension [Self <: KeenTracking](x: Self) {
      
      inline def setExtendEvents(value: Any => KeenClient): Self = StObject.set(x, "extendEvents", js.Any.fromFunction1(value))
      
      inline def setInitAutoTracking(value: KeenAutoTrackingConfig => KeenClient): Self = StObject.set(x, "initAutoTracking", js.Any.fromFunction1(value))
      
      inline def setRecordEvent(value: (String, js.Object) => js.Promise[Created]): Self = StObject.set(x, "recordEvent", js.Any.fromFunction2(value))
      
      inline def setRecordEvents(value: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]): Self = StObject.set(x, "recordEvents", js.Any.fromFunction1(value))
    }
  }
}
