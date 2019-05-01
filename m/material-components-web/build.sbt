organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-14496f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-b6616d",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-f909d9",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-75a864",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-b1bd8b",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-e10d1d",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-9663ee",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-6279a6",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-68df3e",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-03bbf5",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-b4d7c1",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5c8ca8",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-d466d4",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-155885",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-432cfd",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-f2338d",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-338c7f",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2f3f27",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-feea1a",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-47f8de",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-ee9009",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-c772f8",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-77485e",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-dd0a97",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-869f62",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-f38de0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        