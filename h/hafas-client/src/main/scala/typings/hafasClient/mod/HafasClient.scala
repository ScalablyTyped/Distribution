package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HafasClient extends StObject {
  
  /**
    * Retrieves arrivals
    * @param station uid of station
    * @param options options
    */
  def arrivals(station: String): js.Promise[Arrivals] = js.native
  def arrivals(station: String, options: DeparturesArrivalsOptions): js.Promise[Arrivals] = js.native
  def arrivals(station: Location): js.Promise[Arrivals] = js.native
  def arrivals(station: Location, options: DeparturesArrivalsOptions): js.Promise[Arrivals] = js.native
  def arrivals(station: Station): js.Promise[Arrivals] = js.native
  def arrivals(station: Station, options: DeparturesArrivalsOptions): js.Promise[Arrivals] = js.native
  def arrivals(station: Stop): js.Promise[Arrivals] = js.native
  def arrivals(station: Stop, options: DeparturesArrivalsOptions): js.Promise[Arrivals] = js.native
  
  /**
    * Retrieves departures
    * @param station uid of station
    * @param options options
    */
  def departures(station: String): js.Promise[Departures] = js.native
  def departures(station: String, options: DeparturesArrivalsOptions): js.Promise[Departures] = js.native
  def departures(station: Location): js.Promise[Departures] = js.native
  def departures(station: Location, options: DeparturesArrivalsOptions): js.Promise[Departures] = js.native
  def departures(station: Station): js.Promise[Departures] = js.native
  def departures(station: Station, options: DeparturesArrivalsOptions): js.Promise[Departures] = js.native
  def departures(station: Stop): js.Promise[Departures] = js.native
  def departures(station: Stop, options: DeparturesArrivalsOptions): js.Promise[Departures] = js.native
  
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
  def journeys(from: String, to: Stop): js.Promise[Journeys] = js.native
  def journeys(from: String, to: Stop, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Stop): js.Promise[Journeys] = js.native
  def journeys(from: Location, to: Stop, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Stop): js.Promise[Journeys] = js.native
  def journeys(from: Station, to: Stop, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: String): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: String, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Location): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Location, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Station): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Station, options: JourneysOptions): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Stop): js.Promise[Journeys] = js.native
  def journeys(from: Stop, to: Stop, options: JourneysOptions): js.Promise[Journeys] = js.native
  
  /**
    * Retrieves journeys from trip id to station
    * @param fromTripId id of trip
    * @param previousStopover previous stopover
    * @param to uid of station or Station or Stop
    * @param options options
    */
  var journeysFromTrip: js.UndefOr[
    js.Function4[
      /* fromTripId */ String, 
      /* previousStopover */ StopOver, 
      /* to */ String | Station | Stop | Location, 
      /* opt */ js.UndefOr[JourneysFromTripOptions], 
      js.Promise[Journeys]
    ]
  ] = js.native
  
  /**
    * Fetches all lines known to the HAFAS endpoint
    * @param query string
    * @param opt LinesOptions
    */
  var lines: js.UndefOr[
    js.Function2[
      /* query */ String, 
      /* opt */ js.UndefOr[LinesOptions], 
      js.Promise[LinesWithRealtimeData]
    ]
  ] = js.native
  
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
    js.Function2[/* box */ BoundingBox, /* options */ js.UndefOr[RadarOptions], js.Promise[Radar]]
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
      js.Promise[DurationsWithRealtimeData]
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
      js.Promise[JourneyWithRealtimeData]
    ]
  ] = js.native
  
  /**
    * Fetches all remarks known to the HAFAS endpoint
    * @param opt RemarksOptions
    */
  var remarks: js.UndefOr[
    js.Function1[/* opt */ js.UndefOr[RemarksOptions], js.Promise[WarningsWithRealtimeData]]
  ] = js.native
  
  /**
    * Fetches meta information from the HAFAS endpoint
    * @param opt ServerOptions
    */
  def serverInfo(): js.Promise[ServerInfo] = js.native
  def serverInfo(opt: ServerOptions): js.Promise[ServerInfo] = js.native
  
  /**
    * Retrieves information about a stop
    * @param id uid of station
    * @param options options for search
    */
  def stop(id: String): js.Promise[Station | Stop | Location] = js.native
  def stop(id: String, options: StopOptions): js.Promise[Station | Stop | Location] = js.native
  def stop(id: Stop): js.Promise[Station | Stop | Location] = js.native
  def stop(id: Stop, options: StopOptions): js.Promise[Station | Stop | Location] = js.native
  
  /**
    * Refetch information about a trip
    * @param id trip id, see {@link Leg#tripId}
    * @param name name
    * @param options options
    */
  var trip: js.UndefOr[
    js.Function2[
      /* id */ String, 
      /* options */ js.UndefOr[TripOptions], 
      js.Promise[TripWithRealtimeData]
    ]
  ] = js.native
  
  /**
    * Retrieves trips by name.
    * @param lineNameOrFahrtNr string
    * @param options options for search
    */
  var tripsByName: js.UndefOr[
    js.Function2[
      /* lineNameOrFahrtNr */ String, 
      /* options */ js.UndefOr[TripsByNameOptions], 
      js.Promise[TripsWithRealtimeData]
    ]
  ] = js.native
}
