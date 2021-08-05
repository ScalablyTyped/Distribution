package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a {@link DistanceMatrixService} request, consisting of the formatted origin and destination
  * addresses, and a sequence of {@link DistanceMatrixResponseRow}s, one for each corresponding origin address.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse Maps JavaScript API}
  */
trait DistanceMatrixResponse extends StObject {
  
  /**
    * The formatted destination addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.destinationAddresses Maps JavaScript API}
    */
  var destinationAddresses: js.Array[String]
  
  /**
    * The formatted origin addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.originAddresses Maps JavaScript API}
    */
  var originAddresses: js.Array[String]
  
  /**
    * The rows of the matrix, corresponding to the origin addresses.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixResponse.rows Maps JavaScript API}
    */
  var rows: js.Array[DistanceMatrixResponseRow]
}
object DistanceMatrixResponse {
  
  inline def apply(
    destinationAddresses: js.Array[String],
    originAddresses: js.Array[String],
    rows: js.Array[DistanceMatrixResponseRow]
  ): DistanceMatrixResponse = {
    val __obj = js.Dynamic.literal(destinationAddresses = destinationAddresses.asInstanceOf[js.Any], originAddresses = originAddresses.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponse]
  }
  
  extension [Self <: DistanceMatrixResponse](x: Self) {
    
    inline def setDestinationAddresses(value: js.Array[String]): Self = StObject.set(x, "destinationAddresses", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressesVarargs(value: String*): Self = StObject.set(x, "destinationAddresses", js.Array(value :_*))
    
    inline def setOriginAddresses(value: js.Array[String]): Self = StObject.set(x, "originAddresses", value.asInstanceOf[js.Any])
    
    inline def setOriginAddressesVarargs(value: String*): Self = StObject.set(x, "originAddresses", js.Array(value :_*))
    
    inline def setRows(value: js.Array[DistanceMatrixResponseRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: DistanceMatrixResponseRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
