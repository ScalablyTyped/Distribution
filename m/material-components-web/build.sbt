organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-581d93"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-3bb824",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-a038be",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-0c8ff1",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-15d9a9",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-69b88a",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-6aa09b",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-eba6f5",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-2438fa",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-ab4c3e",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-78ed00",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-b4170d",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-63266b",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-a457c8",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-9d1f24",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-bf306f",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-86ad9b",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-8457e9",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-99b62b",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-f17fc6",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-03fd19",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-0b1b8a",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-aec7c2",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-381ea9",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-2bc108",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20190717Z-b77175",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-ed7af4",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-0dbab7",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-7b9d74",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-5a5e3f",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-3f4a83",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        