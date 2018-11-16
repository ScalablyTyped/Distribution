package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a KiiClause expression object
     */
@JSGlobal("KiiCloud.KiiClause")
@js.native
class KiiClause () extends js.Object

/**
     * Represents a KiiClause expression object
     */
@JSGlobal("KiiCloud.KiiClause")
@js.native
object KiiClause extends js.Object {
  /**
           * Create a KiiClause with the AND operator concatenating multiple KiiClause objects
           *
           * @param A variable-length list of KiiClause objects to concatenate
           *
           * @example
           *     KiiClause clause = KiiClause.and(clause1, clause2, clause3, . . .)
           */
  def and(A: kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause*): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key == value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def equals(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create a clause of geo box. This clause inquires objects in the specified rectangle.
           *     Rectangle would be placed parallel to the equator with specified coordinates of the corner.
           *
           * @param key Key to inquire which holds geo point.
           * @param northEast North-Eest corner of the rectangle.
           * @param southWest South-Wast corner of the rectangle.
           *
           * @return KiiClause reference.
           *
           * @throws <li> Specified key is not a string or is an empty string.</li>
           *             <li>northEast or southWest is not a reference of KiiGeoPoint.</li>
           */
  def geoBox(
    key: java.lang.String,
    northEast: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGeoPoint,
    southWest: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGeoPoint
  ): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create a clause of geo distance. This clause inquires objects in the specified circle.
           *
           * @param key Name of the key to inquire, which holds geo point.
           * @param center Geo point which specify center of the circle.
           * @param radius Radius of the circle. unit is meter. value should be in range of ]0, 20000000]
           * @param putDistanceInto Used for retrieve distance from the center from the query result.Must match the pattern "^[a-zA-Z_][a-zA-Z0-9_]*$".
           *   If the specified value is null, query result will not contain the distance.
           *   <b>Note:</b> You can get the results in ascending order of distances from center. To do so, build the orderBy field  by
           *   "_calculated.{specified value of putDistanceInto}" and pass it in {@link KiiQuery#sortByAsc}. Note that, descending order
           *   of distances is not supported. The unit of distance is meter.
           *
           * @return KiiClaluse reference.
           *
           * @throws <li> Specified key is not a string or an empty string.</li>
           *             <li>center is not an object of KiiGeoPoint.</li>
           *             <li>putDistanceInto is not a string or an empty string.</li>
           *
           * @example
           *             var putDistanceInto = "distanceFromCurrentLoc";
           *             var currentLoc = ..; // current location
           *             var clause = KiiClause.geoDistance("location", currentLoc, 4000, putDistanceInto);
           *             var query = KiiQuery.queryWithClause(clause);
           *             // Sort by distances by ascending order.(Optional, use only if you intend to retrieve the distances in a ascending order).
           *             var orderByKey = "_calculated." + putDistanceInto;
           *             query.sortByAsc(orderByKey);
           *             // Define the callbacks
           *             var bucket = Kii.bucketWithName("MyBucket");
           *             var queryCallback = {
           *                 success: function(queryPerformed, resultSet, nextQuery) {
           *                     // check the first object from resultSet.
           *                     var object = resultSet[0];
           *                     var point = object.get("location");
           *                     var distanceToMyLocation = object.get("_calculated")[putDistanceInto];
           *                 },
           *                 failure: function(queryPerformed, anErrorString) {
           *                     // do something with the error response
           *                 }
           *             };
           *             bucket.executeQuery(query, queryCallback);
           */
  def geoDistance(
    key: java.lang.String,
    center: kiiDashCloudDashSdkLib.KiiCloudNs.KiiGeoPoint,
    radius: scala.Double,
    putDistanceInto: java.lang.String
  ): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key > value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def greaterThan(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key >= value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def greaterThanOrEqual(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression to returns all entities that have a specified field and type.
           *
           * @param key name of the specified field.
           * @param fieldType The type of the content of the field. The type of the content of the field must be provided, possible values are "STRING", "INTEGER", "DECIMAL" and "BOOLEAN".
           */
  def hasField(key: java.lang.String, fieldType: java.lang.String): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key in values)
           *
           * @param key The key to compare
           * @param values to compare
           */
  def inClause(key: java.lang.String, values: js.Array[_]): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key < value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def lessThan(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key <= value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def lessThanOrEqual(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create a KiiClause with the NOT operator concatenating a KiiClause object
           * <br><br>
           * <b>Note:</b>
           * Query performance will be worse as the number of objects in bucket increases, so we recommend you avoid the NOT clause if possible.
           *
           * @param clause KiiClause object to negate
           */
  def not(clause: kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key != value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def notEquals(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create a KiiClause with the OR operator concatenating multiple KiiClause objects
           * <br><br>
           * <b>Note:</b>
           * Query performance will be worse as the number of objects in bucket increases, so we recommend you avoid the OR clause if possible.
           *
           * @param A variable-length list of KiiClause objects to concatenate
           *
           * @example
           *     KiiClause clause = KiiClause.or(clause1, clause2, clause3, . . .)
           */
  def or(A: kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause*): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
  /**
           * Create an expression of the form (key STARTS WITH value)
           *
           * @param key The key to compare
           * @param value the value to compare
           */
  def startsWith(key: java.lang.String, value: js.Any): kiiDashCloudDashSdkLib.KiiCloudNs.KiiClause = js.native
}

