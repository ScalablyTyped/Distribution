organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-49915c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-8a9374",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-b8d27a",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-a56f92",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-3afdb0",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-b81296",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-1c274f",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-453a23",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-11d9a7",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-413c2d",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-4f5f12",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-ec6c4b",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-fbfefb",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-ecf2dc",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-7d92a3",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-8ad5e6",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-dffa1e",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-28b987",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-dbd983",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-87bd6a",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-9f7230",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-152c09",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-91c4de",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-6240f2",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-8ff1fc",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20190717Z-d79f7d",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-e45e45",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-40a350",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-63dec5",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-ea5b78",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-865a8f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        