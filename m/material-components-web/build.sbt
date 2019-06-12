organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-a8d847"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-41a2e9",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-fa56cf",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-cad877",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-35d541",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-1285ee",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-a8df67",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-46bf74",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-173e56",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-039311",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-b7c0c4",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-000f64",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-265a43",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-96f763",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-d7473c",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-1ec825",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-4c445f",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-aa0e95",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-62d7d1",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-6df2ae",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-40086e",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-e6abdc",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-c3ed90",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-35d985",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-cfc9d2",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-9beeb7",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        