package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HafasClient extends StObject {
  
  /**
    * Retrieves arrivals
    * @param station uid of station
    * @param options options
    */
  def arrivals(station: String): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: String, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: Station): js.Promise[js.Array[Alternative]] = js.native
  def arrivals(station: Station, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  
  /**
    * Retrieves departures
    * @param station uid of station
    * @param options options
    */
  def departures(station: String): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: String, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: Station): js.Promise[js.Array[Alternative]] = js.native
  def departures(station: Station, options: DeparturesArrivalsOptions): js.Promise[js.Array[Alternative]] = js.native
  
  /**
    * Retrieves journeys
    * @param from uid of station
    * @param to uid of station
    * @param options options
    */
  def journeys(from: String, to: String): js.Promise[Journeys] = js.native
  def journeys(from: String, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  
  /**
    * Retrieves locations or stops
    * @param name name of station
    * @param options options for search
    */
  def locations(name: String): js.Promise[js.Array[Station | Stop | Location]] = js.native
  def locations(name: String, options: LocationsOptions): js.Promise[js.Array[Station | Stop | Location]] = js.native
  
  /**
    * Retrieves nearby stops from location
    * @param location location
    * @param options options for search
    */
  def nearby(location: Location): js.Promise[js.Array[Station | Stop | Location]] = js.native
  def nearby(location: Location, options: NearByOptions): js.Promise[js.Array[Station | Stop | Location]] = js.native
  
  /**
    * Retrieves all vehicles currently in an area.
    * @param box area
    * @param options options for search
    */
  var radar: js.UndefOr[
    js.Function2[
      /* box */ BoundingBox, 
      /* options */ js.UndefOr[RadarOptions], 
      js.Promise[js.Array[Movement]]
    ]
  ] = js.native
  
  /**
    * Retrieves stations reachable within a certain time from a location
    * @param address location
    * @param options options for search
    */
  var reachableFrom: js.UndefOr[
    js.Function2[
      /* address */ Location, 
      /* options */ js.UndefOr[ReachableFromOptions], 
      js.Promise[js.Array[Duration]]
    ]
  ] = js.native
  
  /**
    * refreshes a Journey
    * @param refreshToken refreshToken must be a string, taken from {@link journey#refreshToken}
    * @param options options
    */
  var refreshJourney: js.UndefOr[
    js.Function2[
      /* refreshToken */ String, 
      /* options */ js.UndefOr[RefreshJourneyOptions], 
      js.Promise[Journey]
    ]
  ] = js.native
  
  /**
    * Retrieves information about a stop
    * @param id uid of station
    * @param options options for search
    */
  def stop(id: String): js.Promise[Station | Stop | Location] = js.native
  def stop(id: String, options: StopOptions): js.Promise[Station | Stop | Location] = js.native
  
  /**
    * Refetch information about a trip
    * @param id trip id, see {@link Leg#tripId}
    * @param name name
    * @param options options
    */
  var trip: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* name */ String, 
      /* options */ js.UndefOr[TripOptions], 
      js.Promise[Trip]
    ]
  ] = js.native
}
