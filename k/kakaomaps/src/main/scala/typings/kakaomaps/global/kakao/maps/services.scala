package typings.kakaomaps.global.kakao.maps

import typings.kakaomaps.kakao.maps.services.ANALYZE_TYPE
import typings.kakaomaps.kakao.maps.services.COORDS_
import typings.kakaomaps.kakao.maps.services.MarkerClusterOptions
import typings.kakaomaps.kakao.maps.services.SORT_BY
import typings.kakaomaps.kakao.maps.services.STATUS_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// # Library
// ## services namespace
object services {
  
  @JSGlobal("kakao.maps.services.ANALYZE_TYPE")
  @js.native
  object ANALYZE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.kakaomaps.kakao.maps.services.ANALYZE_TYPE & String] = js.native
    
    /* "exact" */ val EXACT: typings.kakaomaps.kakao.maps.services.ANALYZE_TYPE.EXACT & String = js.native
    
    /* "similar" */ val SIMILAR: typings.kakaomaps.kakao.maps.services.ANALYZE_TYPE.SIMILAR & String = js.native
  }
  
  object AnalyzeType {
    
    @JSGlobal("kakao.maps.services.AnalyzeType.EXACT")
    @js.native
    val EXACT: ANALYZE_TYPE = js.native
    
    @JSGlobal("kakao.maps.services.AnalyzeType.SIMILAR")
    @js.native
    val SIMILAR: ANALYZE_TYPE = js.native
  }
  
  @JSGlobal("kakao.maps.services.COORDS")
  @js.native
  object COORDS_ extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.kakaomaps.kakao.maps.services.COORDS_ & String] = js.native
    
    /* "CONGNAMUL" */ val CONGNAMUL: typings.kakaomaps.kakao.maps.services.COORDS_.CONGNAMUL & String = js.native
    
    /* "TM" */ val TM: typings.kakaomaps.kakao.maps.services.COORDS_.TM & String = js.native
    
    /* "WCONGNAMUL" */ val WCONGNAMUL: typings.kakaomaps.kakao.maps.services.COORDS_.WCONGNAMUL & String = js.native
    
    /* "WGS84" */ val WGS84: typings.kakaomaps.kakao.maps.services.COORDS_.WGS84 & String = js.native
    
    /* "WTM" */ val WTM: typings.kakaomaps.kakao.maps.services.COORDS_.WTM & String = js.native
  }
  
  @JSGlobal("kakao.maps.services.Cluster")
  @js.native
  open class Cluster ()
    extends StObject
       with typings.kakaomaps.kakao.maps.services.Cluster {
    
    /* CompleteClass */
    override def getBounds(): typings.kakaomaps.kakao.maps.LatLngBounds = js.native
    
    /* CompleteClass */
    override def getCenter(): typings.kakaomaps.kakao.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getClusterMarker(): typings.kakaomaps.kakao.maps.CustomOverlay = js.native
    
    /* CompleteClass */
    override def getMarkers(): js.Array[typings.kakaomaps.kakao.maps.Marker] = js.native
    
    /* CompleteClass */
    override def getSize(): Double = js.native
  }
  
  object Coords {
    
    @JSGlobal("kakao.maps.services.Coords.CONGNAMUL")
    @js.native
    val CONGNAMUL: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.TM")
    @js.native
    val TM: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WCONGNAMUL")
    @js.native
    val WCONGNAMUL: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WGS84")
    @js.native
    val WGS84: COORDS_ = js.native
    
    @JSGlobal("kakao.maps.services.Coords.WTM")
    @js.native
    val WTM: COORDS_ = js.native
  }
  
  @JSGlobal("kakao.maps.services.Geocoder")
  @js.native
  open class Geocoder ()
    extends StObject
       with typings.kakaomaps.kakao.maps.services.Geocoder
  
  @JSGlobal("kakao.maps.services.MarkerCluster")
  @js.native
  open class MarkerCluster ()
    extends StObject
       with typings.kakaomaps.kakao.maps.services.MarkerCluster {
    def this(options: MarkerClusterOptions) = this()
  }
  
  @JSGlobal("kakao.maps.services.Pagination")
  @js.native
  open class Pagination ()
    extends StObject
       with typings.kakaomaps.kakao.maps.services.Pagination {
    
    /* CompleteClass */
    var current: Double = js.native
    
    /* CompleteClass */
    override def gotoFirst(): Unit = js.native
    
    /* CompleteClass */
    override def gotoLast(): Unit = js.native
    
    /* CompleteClass */
    override def gotoPage(page: Double): Unit = js.native
    
    /* CompleteClass */
    var hasNextPage: Boolean = js.native
    
    /* CompleteClass */
    var hasPrevPage: Boolean = js.native
    
    /* CompleteClass */
    override def nextPage(): Unit = js.native
    
    /* CompleteClass */
    override def prevPage(): Unit = js.native
    
    /* CompleteClass */
    var totalCount: Double = js.native
  }
  
  @JSGlobal("kakao.maps.services.Places")
  @js.native
  open class Places protected ()
    extends StObject
       with typings.kakaomaps.kakao.maps.services.Places {
    def this(map: typings.kakaomaps.kakao.maps.Map) = this()
  }
  
  @JSGlobal("kakao.maps.services.SORT_BY")
  @js.native
  object SORT_BY extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.kakaomaps.kakao.maps.services.SORT_BY & String] = js.native
    
    /* "accuracy" */ val ACCURACY: typings.kakaomaps.kakao.maps.services.SORT_BY.ACCURACY & String = js.native
    
    /* "distance" */ val DISTANCE: typings.kakaomaps.kakao.maps.services.SORT_BY.DISTANCE & String = js.native
  }
  
  @JSGlobal("kakao.maps.services.STATUS")
  @js.native
  object STATUS_ extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.kakaomaps.kakao.maps.services.STATUS_ & String] = js.native
    
    /* "ERROR" */ val ERROR: typings.kakaomaps.kakao.maps.services.STATUS_.ERROR & String = js.native
    
    /* "OK" */ val OK: typings.kakaomaps.kakao.maps.services.STATUS_.OK & String = js.native
    
    /* "ZERO_RESULT" */ val ZERO_RESULT: typings.kakaomaps.kakao.maps.services.STATUS_.ZERO_RESULT & String = js.native
  }
  
  object SortBy {
    
    @JSGlobal("kakao.maps.services.SortBy.ACCURACY")
    @js.native
    val ACCURACY: SORT_BY = js.native
    
    @JSGlobal("kakao.maps.services.SortBy.DISTANCE")
    @js.native
    val DISTANCE: SORT_BY = js.native
  }
  
  object Status {
    
    @JSGlobal("kakao.maps.services.Status.ERROR")
    @js.native
    val ERROR: STATUS_ = js.native
    
    @JSGlobal("kakao.maps.services.Status.OK")
    @js.native
    val OK: STATUS_ = js.native
    
    @JSGlobal("kakao.maps.services.Status.ZERO_RESULT")
    @js.native
    val ZERO_RESULT: STATUS_ = js.native
  }
}
